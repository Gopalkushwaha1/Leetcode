class Solution {
    static final int mod = 1_000_000_007 ;
    public int countTrapezoids(int[][] points) {
        HashMap<Integer , Integer> map = new HashMap<>() ;  
        long ans = 0 ; 
        long sum = 0 ;

        for ( int[] ele : points ) {
            map.put(ele[1] , map.getOrDefault(ele[1] , 0) + 1 ) ; 
        }  

        for ( int ele : map.values() ) {
            long edge = ((long) ele * (ele-1L)) / 2L ; 
            ans = (ans + edge*sum) ; 
            sum = ( sum + edge); 
        }
        return (int)(ans %mod) ; 
    }
}