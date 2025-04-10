class Solution {
    public boolean isCheck(int a, int b) {
        String str1 = Integer.toString(a) + Integer.toString(b); 
        String str2 = Integer.toString(b) + Integer.toString(a);
        return str1.compareTo(str2) > 0;
    }

    public String largestNumber(int[] nums) {
        // Sort array using custom comparison
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!isCheck(nums[i], nums[j])) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        // Edge case: all zeros
        if (nums[0] == 0) return "0";

        // Build result
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }
}
