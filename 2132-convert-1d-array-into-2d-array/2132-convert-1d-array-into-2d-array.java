class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       if ( m  * n != original.length ) return new int[][]{} ; 
       int[][] ans = new int[m][n] ;
       int row = 0 , col = 0 ;  

       for ( int i = 0 ; i < m*n ; i++ ) {
        ans[row][col] = original[i] ; 
        col++ ; 
        if( col == n ) {
            row++;
            col = 0 ; 
        }
       } 
       return ans ; 
    }
}