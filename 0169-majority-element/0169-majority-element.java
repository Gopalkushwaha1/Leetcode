class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums) ;
        return nums[(0+nums.length)/2] ; 
    }
}