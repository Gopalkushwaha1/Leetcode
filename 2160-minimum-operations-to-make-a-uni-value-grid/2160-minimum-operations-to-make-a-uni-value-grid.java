class Solution {
    public int findOperation(int[] arr , int x , int check ) {
        int req = arr[check] ; 
        int count = 0 ; 
        for ( int ele : arr ) { 
            int diff = Math.abs(req-ele) ; 
            if ( diff % x != 0 ) return -1 ; 
            count += diff/x  ; 
        }
        return count ;
    }
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length*grid[0].length] ;
        int idx = 0 ;  

        for ( int i = 0 ; i < grid.length ; i++ ) {
            for ( int j = 0 ; j < grid[0].length ; j++ ) {
                arr[idx++] = grid[i][j] ; 
            }
        }
        Arrays.sort(arr) ; 
        int oddElement = findOperation(arr,x,arr.length/2) ; 

        return oddElement == -1 ? -1 : oddElement ; 

    }
}