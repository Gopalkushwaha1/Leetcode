class Solution {

    public boolean isPossible(long time, int height, int[] workerTimes) {

        long totalHeight = 0;

        for (int w : workerTimes) {

            // k = (-1 + sqrt(1 + 8*time/w)) / 2
            long k = (long)((Math.sqrt(1 + (8.0 * time) / w) - 1) / 2);

            totalHeight += k;

            if (totalHeight >= height) return true;
        }

        return false;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long maxWorker = 0;

        for (int w : workerTimes) {
            maxWorker = Math.max(maxWorker, w);
        }

        long right = maxWorker * (long)mountainHeight * (mountainHeight + 1) / 2;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (isPossible(mid, mountainHeight, workerTimes))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}