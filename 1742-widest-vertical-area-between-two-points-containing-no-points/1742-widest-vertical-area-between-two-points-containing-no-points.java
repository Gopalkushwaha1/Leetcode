class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] ans = new int[points.length];
        for ( int i = 0 ; i < points.length ; i++ ) {
            ans[i] = points[i][0] ; 
        }
        Arrays.sort(ans);
        int result = 0 ; 
        for ( int i = 1 ; i < points.length ; i++ ) {
            result = Math.max(result , ans[i] - ans[i-1]);
        }
        return result ; 
    }
}