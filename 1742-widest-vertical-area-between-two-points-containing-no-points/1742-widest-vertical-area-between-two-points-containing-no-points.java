class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points , (a,b) -> Integer.compare(a[0] , b[0]));
        int ans = 0  ; 

        // Calculate max area 
        for ( int i = 0 ; i < points.length - 1 ; i++ ) {
            int a = points[i][0];
            int b = points[i+1][0] ;
            ans = Math.max(ans , b-a ) ; 
        } 
        return ans ; 
    }
}