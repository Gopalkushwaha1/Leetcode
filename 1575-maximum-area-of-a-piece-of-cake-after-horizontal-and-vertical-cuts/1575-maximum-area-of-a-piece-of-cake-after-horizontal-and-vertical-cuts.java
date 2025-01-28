class Solution {
    public int maxArea(int h, int w, int[] hor, int[] ver) {
        // Sort the arrays
        Arrays.sort(hor);
        Arrays.sort(ver);

        int maxVer = ver[0], maxHor = hor[0];

        // Calculate the maximum horizontal gap
        for (int i = 1; i < hor.length; i++) {
            maxHor = Math.max(maxHor, hor[i] - hor[i - 1]);
        }

        // Calculate the maximum vertical gap
        for (int i = 1; i < ver.length; i++) {
            maxVer = Math.max(maxVer, ver[i] - ver[i - 1]);
        }

        // Include the remaining edges
        maxVer = Math.max(maxVer, w - ver[ver.length - 1]);
        maxHor = Math.max(maxHor, h - hor[hor.length - 1]);

        

        // Correct modulo calculation
        return (int) ((1L * maxVer * maxHor) % 1000000007);
    }
}
