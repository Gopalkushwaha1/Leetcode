class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length] ; 
        int even = 0 , odd = nums.length-1 ; 

        for ( int ele : nums ) {
            if ( ele % 2 == 0 ) {
                ans[even++] = ele ; 
            }
            else {
                ans[odd--] = ele ; 
            }
        }
        return ans ; 
    }
}