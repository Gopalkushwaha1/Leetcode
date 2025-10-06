class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = 0 , c = 0 ; 
        int tr = matrix.length-1 , tc = matrix[0].length-1 ; 
        List<Integer> ans = new ArrayList<>() ; 

        while ( r <= tr && c <= tc ) {

            // Left to right move 
            for ( int col = r ; col <= tc ; col++ ) {
                ans.add(matrix[r][col]) ; 
            }
            
            // Top to down 
            for ( int row = r + 1 ; row <= tr ; row++ ) {
                ans.add(matrix[row][tc]) ; 
            }

            if ( r < tr && c < tc ) {
                // Right to left 
            for ( int col = tc - 1 ; col >= r ; col-- ) {
                ans.add(matrix[tr][col]) ; 
            }

            // Down to top 
            for ( int row = tr - 1 ; row > r ; row-- ) {
                ans.add(matrix[row][r]) ; 
            }
            }

            r++ ; 
            c++ ; 
            tr--;
            tc--;
        }
        return ans ; 
    }
}