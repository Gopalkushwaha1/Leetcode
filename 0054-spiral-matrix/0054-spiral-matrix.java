class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>() ; 
        int r = 0 , c = 0 ; 
        int lr = matrix.length - 1 , lc = matrix[0].length - 1 ; 

        while ( r <= lr && c <= lc ) {

            // Left to right top 
            for ( int col = r ; col <= lc ; col++ ) {
                list.add(matrix[r][col]);
            }
            for ( int row = r + 1 ; row <= lr ; row++ ) {
                list.add(matrix[row][lc]) ; 
            }
            if ( r < lr && c < lc ) {
                for ( int col = lc-1 ; col >= c ; col-- ) {
                list.add(matrix[lr][col]) ; 
            }
            for ( int row = lr-1 ; row > r ; row-- ) {
                list.add(matrix[row][c]) ; 
            }
            }

            r++;
            c++;
            lr--;
            lc--;
        }
        return list;
    }
}