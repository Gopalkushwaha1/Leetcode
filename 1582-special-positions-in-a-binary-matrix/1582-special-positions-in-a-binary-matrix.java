class Solution {
    public int numSpecial(int[][] mat) {
        // take count and len row and col 

        int count = 0 ;
        int row = mat.length ; 
        int col = mat[0].length ; 

        // travel each cell 

        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {
                // check if 1 

                // check all row only 1 -> 1 
                // check all col only 1 -> 1 

                if( mat[i][j] == 1 ) {
                    // localCount 
                    int localCount = 0 ; 
                    for ( int k = 0 ; k < col ; k++ ) {
                        if(mat[i][k] == 1 ) {
                            localCount++ ; 
                        }
                        if(localCount > 1 ) break ; 
                    }
                    if(localCount != 1 ) break ; 
                    localCount = 0 ;

                    for ( int l = 0 ; l < row ; l++ ) {
                        if(mat[l][j] == 1 ) {
                            localCount++ ; 
                        }
                        if(localCount > 1 ) break ; 
                    }
                    if(localCount != 1 ) break ; 
                    count++ ; 
                }
            }
        }
        return count ; 
    }
}