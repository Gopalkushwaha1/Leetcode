class Solution {
    public int findPeakElement(int[] nums) {
        int max =Integer.MIN_VALUE;
        int ans  = -1;
        for(int i = 0 ; i< nums.length ; i++){
          if(nums[i] >= max){
            max = nums[i];
            ans = i;
          }
        }
        return ans ;
    }
}