class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // Step 1: Find the maximum element in the array to size the frequency array
        int max = 0; 
        for (int ele : nums) {
            max = Math.max(ele, max);
        }

        // Step 2: Initialize the frequency array to track occurrences of each element
        int[] freq = new int[max + 1];

        // Sliding window pointers, sum of the current subarray, and max sum
        int start = 0, end = 0, sum = 0, maxSum = 0;

        // Step 3: Traverse the array
        while (end < nums.length) {
            int ele = nums[end];
            freq[ele]++; // Increment frequency of the current element

            // If the element's frequency is greater than 1, adjust the window
            while (freq[ele] != 1) {
                int idx = nums[start];
                freq[idx]--; // Reduce the frequency of the element at `start`
                sum -= idx;  // Remove its value from the current sum
                start++;     // Move the start pointer to shrink the window
            }

            // Add the current element to the sum if it's unique
            if (freq[ele] == 1) {
                sum += ele;
                maxSum = Math.max(sum, maxSum); // Update the maximum sum
                end++; // Expand the window by moving `end` pointer
            }
        }

        // Return the maximum sum of a unique subarray
        return maxSum;
    }
}
