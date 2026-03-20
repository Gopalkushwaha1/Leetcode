class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int row = grid.length ; 
        int col = grid[0].length ; 

        // ans matrix 
        int[][] ans = new int[row-k+1][col-k+1] ; 

        // start the sliding 
        for ( int i = 0 ; i <= row - k; i++ ) {
            for ( int j = 0 ; j <= col - k  ; j++ ) {
                // take haset for dis 
                HashSet<Integer> set = new HashSet<>() ; 

                // travel on k*k window find the min 
                int min = Integer.MAX_VALUE ; 

                for ( int l = i ; l < i+ k  ; l++ ) {
                    for ( int m = j ; m < j + k ; m++ ) {
                        set.add(grid[l][m]) ; 
                    }
                }

                // convert int list for eff find min 
                List<Integer> list = new ArrayList<>(set) ; 
                // sort 
                Collections.sort(list) ; 

                for ( int n = 1 ; n < list.size() ; n++ ) {
                    if(list.get(n) != list.get(n-1)) {
                        min = Math.min(min , list.get(n)- list.get(n-1)) ; 
                    }
                }
                ans[i][j] = (min == Integer.MAX_VALUE) ? 0 : min ; 
            }
        }
        return ans ; 
    }
}