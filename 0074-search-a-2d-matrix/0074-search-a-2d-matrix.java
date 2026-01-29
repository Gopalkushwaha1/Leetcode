class Solution { 
    public boolean binarySerach(int[][] matrix , int target , int i ) {
        int start = 0 ; 
        int end = matrix[0].length-1 ; 

        while ( start <= end ) {
            int mid = (start+end) / 2 ; 

            if(matrix[i][mid] == target ) {
                return true ; 
            }
            else if (matrix[i][mid] < target ) {
                start = mid + 1 ; 
            }
            else {
                end = mid - 1 ; 
            }
        }
        return false ;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length ; 
        int col = matrix[0].length ; 

        for ( int i = 0 ; i < row ; i++ ) {
            if(target >= matrix[i][0] && target <= matrix[i][col-1]){
                return binarySerach(matrix , target , i ) ; 
            }
        }

        return false ; 
    }
}