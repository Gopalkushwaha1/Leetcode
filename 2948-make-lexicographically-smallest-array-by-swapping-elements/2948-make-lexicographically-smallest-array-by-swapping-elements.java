class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        // Store value + original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = 0;

        while (start < n) {

            int end = start;

            // Find one group
            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            // Get original indices
            int[] indices = new int[end - start + 1];

            for (int i = start; i <= end; i++) {
                indices[i - start] = arr[i][1];
            }

            // Sort original indices
            Arrays.sort(indices);

            // Put sorted values into sorted original positions
            for (int i = 0; i < indices.length; i++) {
                nums[indices[i]] = arr[start + i][0];
            }

            start = end + 1;
        }

        return nums;
    }
}