class Solution {
    public int find(int[][] grid , int i , int j , int k ) {
        int n = grid.length ; 
        int m = grid[0].length ; 

        // early check out of bound 
        if( i + 2*k >= n || j + k >= m || j - k < 0 ) return -1 ; 

        int r = i ;
        int c = j ; 
        int sum = 0 ; 

        for ( int l = 0 ; l < k ; l++ ) {
            sum += grid[r+l][c-l] ; 
        }

        r = i + k ; 
        c = j - k ; 

        for ( int l = 0 ; l < k ; l++ ) {
            sum += grid[r+l][c+l] ; 
        }

        r = i + 2 * k ; 
        c = j ; 

        for ( int l = 0 ; l < k ; l++  ) {
            sum += grid[r-l][c+l] ; 
        }

        r = i + k ; 
        c = j + k ; 

        for ( int l = 0 ; l < k ; l ++ ){
            sum += grid[r-l][c-l] ; 
        }

        return sum ; 

        


    }
    public int[] getBiggestThree(int[][] grid) {
        // size 
        int row = grid.length ; 
        int col = grid[0].length ; 

        // Set and Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>() ; 
        Set<Integer> set = new HashSet<>() ; 


        // go to each cell find sum 
        for ( int i = 0 ; i < row ; i++ ) {
            for ( int j = 0 ; j < col ; j++ ) {

                // single cell bhi rhombus 
                if(set.add(grid[i][j])) {
                    pq.add(grid[i][j]) ; 

                    // top 3 hi chyie hmko 
                    if(pq.size() > 3 ) pq.remove() ; 
                }

                // now start make rhombus 1 ...... k -> Min ( row , col ) 

                for ( int k = 1 ; k < (Math.min(row , col )/2)+1 ; k++ ) {
                    int ele = find(grid , i , j , k ) ; 

                    if(ele == -1  ) break ; 

                    if(set.add(ele)) {
                    pq.add(ele) ; 

                    // top 3 hi chyie hmko 
                    if(pq.size() > 3 ) pq.remove() ; 
                    }
                }
            }
        }

        // size cal 
        int n = pq.size() ; 
        int[] ans = new int[n] ; 

        for ( int i = n - 1 ; i >= 0 ; i-- ) {
            ans[i] = pq.remove() ; 
        }

        return ans ; 
    }
}