class Solution {
    public int maxArea(int[] height) {
        int start = 0 , end = height.length - 1 , maxArea = 0 ;

        while ( start < end ) {

            if ( height[start] < height[end]) {
                maxArea = Math.max(maxArea , height[start] * (end - start));
                start++ ; 
            }

            else {
                maxArea = Math.max(maxArea , height[end] * (end - start));
                end-- ;
            }
        }
        
        return maxArea ; 
    }
}