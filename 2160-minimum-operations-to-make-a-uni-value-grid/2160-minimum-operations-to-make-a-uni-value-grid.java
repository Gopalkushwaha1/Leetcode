class Solution {
    public int findOperation(int[] arr , int x , int check ) {
        int req = arr[check] ; 
        int count = 0 ; 

        for ( int ele : arr ) { 
            if ( ele == req ) continue ; 
            else if ( ele < req ) {
                while ( ele != req ) {
                    count++;
                    ele += x ; 
                    if ( ele > req ) return -1 ; 
                }
            }
            else {
                while ( ele != req ) {
                    count++;
                    ele -= x ;
                    if ( ele < 0 ) return -1 ; 
                }
            }
        }
        return count ;
    }
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length*grid[0].length] ;
        int ans = 0 , idx = 0 ;  

        for ( int i = 0 ; i < grid.length ; i++ ) {
            for ( int j = 0 ; j < grid[0].length ; j++ ) {
                arr[idx++] = grid[i][j] ; 
            }
        }
        Arrays.sort(arr) ; 
        // if ( arr.length % 2 == 0 ) {
        //     int left = findOperation(arr , x , (arr.length-1)/2) ; 
        //     int right = findOperation(arr , x , arr.length/2) ;
        //     if ( left == -1 || right == -1 ) {
        //         return -1 ; 
        //     }
        //     return Math.min(left , right ) ; 
        // }
        int oddElement = findOperation(arr,x,arr.length/2) ; 

        return oddElement == -1 ? -1 : oddElement ; 

    }
}