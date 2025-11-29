class Solution {
    public void moveZeroes(int[] nums) {
        int[] num = new int[nums.length] ; 
        int k = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if( nums[i] != 0 ) {
                num[k++] = nums[i] ; 
            }
        }
        for ( int i = 0 ; i < nums.length ; i++ ) {
            nums[i] = num[i] ; 
        }
    }
}