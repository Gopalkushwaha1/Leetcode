class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0 ; // To store ans 
        int[] copyHeight = new int[heights.length] ; 
        for ( int ele : heights ) {
            copyHeight[ans++] = ele ; 
        }
        ans = 0 ; 
        Arrays.sort(copyHeight) ; 

        // count mismatch palce 
        for ( int i = 0 ; i < heights.length ; i++ ) {
            if ( heights[i] != copyHeight[i]) ans++ ; 
        }

        return ans ; 
    }
}