import java.util.*;

class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;

        Deque<Integer> maxDeque = new ArrayDeque<>(); // decreasing
        Deque<Integer> minDeque = new ArrayDeque<>(); // increasing

        long count = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {

            // ---- add nums[j] to maxDeque ----
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[j]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(nums[j]);

            // ---- add nums[j] to minDeque ----
            while (!minDeque.isEmpty() && minDeque.peekLast() > nums[j]) {
                minDeque.pollLast();
            }
            minDeque.addLast(nums[j]);

            // ---- shrink window if invalid ----
            while (!maxDeque.isEmpty() && !minDeque.isEmpty() &&
                   (long)(maxDeque.peekFirst() - minDeque.peekFirst()) * (j - i + 1) > k) {

                // remove nums[i] from deques if needed
                if (maxDeque.peekFirst() == nums[i]) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() == nums[i]) {
                    minDeque.pollFirst();
                }
                i++; // shrink from left
            }

            // ---- count valid subarrays ending at j ----
            count += (j - i + 1);
        }

        return count;
    }
}
