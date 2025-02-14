class Solution {
    public int maxArea(int[] height) {
        // Variable declear 
        int i = 0 , j = height.length - 1  , ans = 0 ; 

        // Calculating max
        while ( i < j ) {
            int area = Math.min(height[i] , height[j]) ; 
            int idx = j - i ; 
            ans = Math.max ( ans , area * idx) ; 
            if ( height[i] < height[j]) {
                i++;
            }
            else {
                j-- ; 
            }
        }
        return ans ; 
    }
}