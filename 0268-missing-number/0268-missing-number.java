class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ; 
        int totalSum = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++  ) {
            sum += nums[i] ; 
            totalSum += i ; 
        }
        totalSum += nums.length ; 
        return totalSum - sum ; 
    }
}