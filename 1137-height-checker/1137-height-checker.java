class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int n : heights) {
            freq[n]++;
        }

        int unexpected = 0;
        int hi = 0;
        for (int i = 1; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                if (heights[hi++] != i) unexpected++;
            }
        }
        return unexpected;
    }
}