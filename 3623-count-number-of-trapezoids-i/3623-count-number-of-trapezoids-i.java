class Solution {
    public int countTrapezoids(int[][] points) {
        HashMap<Integer , Integer> map = new HashMap<>() ; 
        int mod = 1_000_000_007 ; 
        long ans = 0 ; 
        long sum = 0 ;

        for ( int[] ele : points ) {
            map.put(ele[1] , map.getOrDefault(ele[1] , 0) + 1 ) ; 
        }  

        for ( int ele : map.values() ) {
            long edge = ((long) ele * (ele-1)) / 2 ; 
            ans = (ans + edge*sum) % mod ; 
            sum = ( sum + edge) % mod ; 
        }
        return (int)ans ; 
    }
}