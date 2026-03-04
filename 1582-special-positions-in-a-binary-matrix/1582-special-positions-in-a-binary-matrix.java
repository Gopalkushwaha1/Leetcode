class Solution {
    public int numSpecial(int[][] mat) {
        // take count and rowCount colCount 

        int count = 0 ; 
        int row = mat.length ; 
        int col = mat[0].length ; 

        // row count store 
        // col count store 
        int[] rowCount = new int[row] ; 
        int[] colCount = new int[col] ; 


        // fill row count and col count 

        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                if(mat[i][j] == 1 ) {
                    rowCount[i]++ ; 
                    colCount[j]++ ; 
                }
            }
        }

        // travel each cell and check 

        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                if(mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1  ) {
                    count++ ; 
                }
            }
        }

        return count ; 
    }
}