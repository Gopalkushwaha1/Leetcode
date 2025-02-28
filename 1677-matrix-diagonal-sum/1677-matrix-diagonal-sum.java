class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ; 

        for ( int i = 0 ; i <  mat.length ; i++ ) {
            sum += mat[i][i] ; 

            if ( mat.length - i - 1 != i ) {
                sum += mat[mat.length-1-i][i] ; 
            }
        }

        return sum ; 
    }
}