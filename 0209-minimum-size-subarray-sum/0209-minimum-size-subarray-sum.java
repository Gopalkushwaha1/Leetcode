class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0 , end = 0 , sum = 0 , len = Integer.MAX_VALUE  ; 

        while ( end < nums.length ) {
            sum += nums[end] ; 

            while ( sum >= target ) {
                len = Math.min ( len , end - start + 1 ) ; 
                sum -= nums[start];
                start++ ; 
            }
            end++ ; 
        }
        return len == Integer.MAX_VALUE ? 0 : len ; 
    }
}