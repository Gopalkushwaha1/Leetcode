class Solution {
    public void arrange(int[] arr , int i , int j ) {
        for ( int k = j - 1 ; k >= i ; k-- ) {
            int temp = arr[k] ; 
            arr[k] = arr[k+1] ; 
            arr[k+1] = temp ; 
        }
    }
    public int minSwaps(int[][] grid) {
        // take varibale 
        int ansCount = 0 ; 
        int n = grid.length ; 
        int[] arr = new int[n] ; 

        // arr to countZero 

        for ( int i = 0 ; i < n ; i++ ) {
            // take countZero 
            int countZero = 0 ; 
            // travel from last if 1 then break 
            for ( int j = n - 1 ; j >= 0 ; j-- ) {
                if(grid[i][j] != 0 ) break ; 
                countZero++ ; 
            }
            // fill the arr 
            arr[i] = countZero ; 
        }

        // find arrnage total 

        for ( int i = 0 ; i < n ;i++ ) {
            // early check 
            if ( arr[i] >= n - i - 1 ) continue ; 
            int maxIdx = i ; 

            for ( int j = i + 1 ; j < n ; j++ ) {
                if ( arr[j] >= n - i - 1 ) {
                    maxIdx = j ; 
                    break ; 
                }
            }
            ansCount += maxIdx - i ;       // update the ans Count 
            arrange(arr , i , maxIdx )  ;   // arrange the arr 
        }

        // check 

        for ( int i = 0 ; i < n ; i++ ) {
            if(arr[i] < n - i - 1 ) return -1 ; 
        }

        return ansCount ; 
    }
}