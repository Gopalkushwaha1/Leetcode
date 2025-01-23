class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0 , j = 1 ; ;
        int[] ans = new int[nums.length] ; 
        ans[0] = nums[0] ;

        for ( int i = 1 ; i < nums.length ; i++ ) {
            if( nums[i] != nums[i-1]) {
                ans[j++] = nums[i] ;
                unique++ ; 
            }
        }
        for ( int i = 0 ; i < nums.length ; i++ ) {
            nums[i] = ans[i] ; 
        }
        return unique + 1 ; 
    }
}