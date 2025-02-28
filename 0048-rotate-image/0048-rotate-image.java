class Solution {
    public void swap(int i , int j , int[][] mat ) {
            int ele = mat[i][j] ; 
            mat[i][j] = mat[j][i] ; 
            mat[j][i] = ele ; 
        }
     public void reverse ( int[] n, int i , int j ) {
            while (i <= j  ) {
                int temp = n[i] ; 
                n[i] = n[j] ; 
                n[j] = temp ; 
                i++;
                j--;
            }
        }
    public void rotate(int[][] matrix) {
        for ( int i = 0 ; i < matrix.length ; i++ ) {
            for ( int j = i + 1 ; j < matrix.length ; j++ ) {
                swap(i,j,matrix) ; 
            }
        }
        for ( int[] num : matrix ) {
            reverse(num , 0 , matrix.length - 1 ) ; 
        }
    }
}