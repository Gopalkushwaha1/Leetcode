class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int idx = grid.length ; 
        int[] ans = new int[(idx * idx) + 1] ; 
        int[] result = {-1,-1} ; 
        for ( int i = 0 ; i < grid.length ; i++ ) {
            for ( int j = 0 ; j < grid.length  ; j++ ) {
                int k = grid[i][j] ;  
                ans[k]++;
            }
        }
         
        for ( int i = 1 ; i < ans.length ; i++ ) {
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