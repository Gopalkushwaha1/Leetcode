class Solution {
    // Function to return reverse of element 
    public int reverse( int ele ) {
        int a = ele ; 
        int res = 0 ; 
        while ( ele != 0 ) {
            res = res * 10 + ele%10 ; 
            ele = ele/10 ; 
        }
        System.out.println( a + "-> " + res );
        return res ; 
    }
    public int countDistinctIntegers(int[] nums) {
        // For distinct count use Set 
        HashSet<Integer> set = new HashSet<>() ; 
        // Travel each ele in nums 
        for ( int ele : nums ) {
            // Also find reverse of each element 
            set.add(ele) ; // add ele
            set.add(reverse(ele)) ; // add reverse ele 
        }
        // return set size because it store distinct element 
        return set.size() ; 
    }
}