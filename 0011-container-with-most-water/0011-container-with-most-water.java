class Solution {
    public int maxArea(int[] height) {
        int ans = 0 ;
        int i = 0 ; 
        int j = height.length-1 ; 

        while ( i < j ) {
            int waterContias = (j-i)*Math.min(height[i] , height[j]) ;
            ans = Math.max(ans , waterContias) ;
            if( height[i] < height[j]) { 
                i++ ; 
            }
            else {
                j-- ; 
            }
        }
        return ans ; 
    }
}