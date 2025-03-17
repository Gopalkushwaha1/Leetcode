class Solution {
    public boolean divideArray(int[] nums) {
        int[] num = new int[501] ; 

        for ( int ele : nums ) {
            num[ele]++ ; 
        }

        for ( int ele : num ) {
            if ( ele % 2 != 0 ) return false ; 
        }

        return true ; 
    }
}