class Solution {
    public boolean isPossible(int mid, int[] candies, long k) {
        if (mid == 0) return false;
        long count = 0;
        for (int ele : candies) count += ele / mid;
        return count >= k;
    }

    public int maximumCandies(int[] candies, long k) {
        int start = 1, end = 0;
        long sum = 0;
        
        for (int ele : candies) {
            end = Math.max(ele, end);
            sum += ele;
        }
        if (sum < k) return 0;
        if (k == 1) return end;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(mid, candies, k)) start = mid + 1;
            else end = mid - 1;
        }
        
        return end;
    }
} 
