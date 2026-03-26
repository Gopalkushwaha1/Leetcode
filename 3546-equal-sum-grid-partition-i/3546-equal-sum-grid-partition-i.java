class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int r = grid.length ; 
        int c = grid[0].length ; 
        int totalSum = 0 ; 

        for ( int i = 0 ; i < r ; i++ ){
            for( int j = 0 ; j < c ; j++ ) {
                totalSum += grid[i][j] ; 
            }
        }

        // checking by row partation 
        int localSum = 0 ; 
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                localSum += grid[i][j] ; 
            }
            if(localSum*2 == totalSum) return true ; 
        }
        
        localSum = 0 ; 
        for ( int i = 0 ; i < c ; i++ ) {
            for ( int j = 0 ; j < r ; j++ ) {
                localSum += grid[j][i] ; 
            }
            if(localSum*2 == totalSum) return true ; 
        }

        return false ; 
    }
}