class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ( mat.length * mat[0].length != r * c ) return mat ; 
        int[][] ans = new int[r][c] ; 
        int row = 0 , col = 0 ; 

        for ( int[] num : mat ) {
            for ( int ele : num ) {
                ans[row][col] = ele ; 
                col++ ; 
                if ( col == c ) {
                    row++;
                    col = 0 ; 
                }
            }
        }
        return ans ; 
    }
}