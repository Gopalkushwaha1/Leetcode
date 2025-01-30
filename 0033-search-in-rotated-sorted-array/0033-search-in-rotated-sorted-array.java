class Solution {
    public int binary(int[] nums, int start, int end, int tar) {
        int i = start, j = end;

        while (i <= j) {
            int mid = i + (j - i) / 2; // Prevent integer overflow
            if (nums[mid] == tar) {
                return mid;
            } else if (nums[mid] > tar) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    public int find(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2; // Prevent integer overflow
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public int search(int[] nums, int target) {
        int findIdx = find(nums);
        int n = nums.length;

        if (n == 1) { // Single element edge case
            return nums[0] == target ? 0 : -1;
        }

        // Check the appropriate range
        if (target >= nums[findIdx] && target <= nums[n - 1]) {
            return binary(nums, findIdx, n - 1, target);
        } else {
            return binary(nums, 0, findIdx - 1, target);
        }
    }
}
