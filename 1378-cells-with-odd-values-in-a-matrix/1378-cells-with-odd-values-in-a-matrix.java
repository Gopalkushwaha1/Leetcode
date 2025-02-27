class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       int[][] ans = new int[m][n] ; 

       for ( int l = 0 ; l < indices.length ; l++ ) {
        int row = indices[l][0] ; 
        int col = indices[l][1] ;

        for ( int i = 0 ; i < n ; i++ ) {
            ans[row][i]++;
        }
        for ( int j = 0 ; j < m ; j++ ) {
            ans[j][col]++;
        }
       } 
       int count = 0 ; 
       for ( int i = 0 ; i < m ; i++ ) {
        for ( int j = 0 ;  j < n ; j++ ) {
            if ( ans[i][j] %2 != 0 ) {
                count++ ; 
            }
        }
       }
       return count ; 
    }
}