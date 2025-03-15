class Solution {
    public int trap(int[] height) {
        int[] leftBig = new int[height.length] ; 
        int[] rightBig = new int[height.length] ; 
        int ans = 0 ; 

        for ( int i = 1 ; i < height.length ; i++ ) {
            leftBig[i] = Math.max(leftBig[i-1] , height[i-1]) ;
        }
        for ( int i = height.length - 2 ; i >= 0 ; i-- ) {
            rightBig[i] = Math.max( rightBig[i+1] , height[i+1]) ; 
        }

        for ( int i = 1 ; i < height.length - 1 ; i++ ) {
            int min = Math.min(rightBig[i] , leftBig[i]) ; 

            if ( min <= height[i]) continue ; 
            ans += min - height[i] ; 
        }

        return ans ; 
    }
}