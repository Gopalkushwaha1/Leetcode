class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1, inc = 1, dec = 1;
        for (int i = 1; i < nums.length; i++) {
            inc = nums[i] > nums[i - 1] ? inc + 1 : 1;
            dec = nums[i] < nums[i - 1] ? dec + 1 : 1;
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }
        return maxLen;
    }
}
