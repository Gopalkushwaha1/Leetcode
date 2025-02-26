class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0 ; // To store ans 
        int[] copyHeight = Arrays.copyOf(heights , heights.length); 
        Arrays.sort(copyHeight) ; 

        // count mismatch palce 
        for ( int i = 0 ; i < heights.length ; i++ ) {
            if ( heights[i] != copyHeight[i]) ans++ ; 
        }

        return ans ; 
    }
}