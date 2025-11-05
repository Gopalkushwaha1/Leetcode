class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        // Step 1: Sort envelopes
        // Width ascending, but if same width → height descending
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];  // important: descending for equal widths
            return a[0] - b[0];
        });

        // Step 2: Extract only the heights
        int n = envelopes.length;
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = envelopes[i][1];
        }

        // Step 3: Find LIS on heights (strictly increasing)
        List<Integer> lis = new ArrayList<>();

        for (int h : heights) {
            int idx = Collections.binarySearch(lis, h);
            if (idx < 0) idx = -idx - 1; // insertion point

            if (idx == lis.size())
                lis.add(h);
            else
                lis.set(idx, h);
        }

        // Step 4: The size of LIS is the maximum number of envelopes
        return lis.size();
    }
}
