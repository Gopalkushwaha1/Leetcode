class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // make Row and Col List 

        int row = grid.length ; 
        int col = grid[0].length ; 
        List<List<Integer>> list = new ArrayList<>() ; 

        // Fix the k

        k = k % ( row * col ) ; 

        // Dirct return ans if k == 0 

        // Shift k times
        for ( int i = 0 ; i < k ; i++ ) {
            // Take two varibale 

            int curr = grid[0][0] ; 
            int prev = grid[0][0] ; 

            // Go to each element fix the position
            for ( int r = 0 ; r < row ; r++ ) {
                for ( int c = 0 ; c < col ; c++ ) {

                    prev = curr ; 
                    curr = grid[r][c] ; 
                    grid[r][c] = prev ; 

                }
            }

            // Last element to top 
            grid[0][0] = curr ; 
        }
        // 2D --> List 
        for ( int i = 0 ; i < row ; i++ ) {
            List<Integer> li = new ArrayList<>() ; 
            for ( int j = 0 ; j < col ; j++ ) {
                li.add(grid[i][j]) ; 
            }
            list.add(li) ; 
        }

        // return the ans 
        return list ; 
    }
}