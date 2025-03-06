class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2501] ; 
        int[] result = {-1,-1} ; 
        for ( int i = 0 ; i < grid.length ; i++ ) {
            for ( int j = 0 ; j < grid.length  ; j++ ) {
                int idx = grid[i][j] ;  
                ans[idx]++;
            }
        }
        int idx = grid.length ;  
        for ( int i = 1 ; i <=  idx * idx ; i++ ) {
            if ( ans[i] > 1 ){
                 result[0] = i ; 
            }
            if ( ans[i] == 0 ){
                 result[1] = i ; 
            }
        }
        return result ; 
    }
}