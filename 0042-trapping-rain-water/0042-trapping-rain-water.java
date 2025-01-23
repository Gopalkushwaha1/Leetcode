class Solution {
    public int trap(int[] height) { 
        int left = 0 , right = height.length - 1 ;
        int leftMax = 0 , rightMax = 0 , maxtrap = 0 ; 

        while ( left < right ) {
            if ( height[left] < height[right]) {
                if(leftMax > height[left] ) {
                    maxtrap += leftMax - height[left] ; 
                }
                leftMax = Math.max ( leftMax , height[left]);
                left++ ; 
            }
            else {
                if ( rightMax > height[right]) {
                    maxtrap += rightMax - height[right] ; 
                }
                rightMax = Math.max ( rightMax , height[right]);
                right-- ; 
            }
        } 
        return maxtrap ; 
    }
}