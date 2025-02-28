class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n] ; 
        int count = 1 ; 
        int r = 0 , c = 0 , lr = n-1 , lc = n - 1 ; 

        while ( r <= lr && c <= lc ) {

            for ( int col = r ; col <= lc ; col++ ) {
                arr[r][col] = count++;
            }

            for ( int row = r + 1 ; row <= lr ; row++ ) {
                arr[row][lc] = count++;
            }

            for ( int col = lc - 1 ; col >= c ; col-- ) {
                arr[lr][col] = count++ ;
            }

            for ( int row = lr - 1 ; row > r ; row-- ) {
                arr[row][c] = count++ ; 
            }

            r++;
            c++;
            lr--;
            lc--;
        }
        return arr ; 
    }
}