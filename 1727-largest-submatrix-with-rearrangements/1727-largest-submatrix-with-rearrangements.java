class Solution {
    public int largestSubmatrix(int[][] matrix) {
        // take row and col 

        int n = matrix.length ; 
        int m = matrix[0].length ; 
        int ans = 0 ; 

        // travel matrix find cumm sum 

        for ( int row = 0 ; row < n ; row++ ) {
            for ( int col = 0 ; col < m ; col++ ) {
                // jb cell me 1 ho find cumm sum
                if(matrix[row][col] == 1 && row > 0 ) {
                    matrix[row][col] += matrix[row-1][col] ; 
                } 
            }

            // clone the curr row and sort 
            int[] currRow = matrix[row].clone() ; 
            Arrays.sort(currRow) ; 

            // Apply the logic
            for ( int i = 0 ; i < m ; i++ ) {
                ans = Math.max(ans , currRow[i] * (m-i)) ; 
            }
        }
        return ans ; 
    }
}