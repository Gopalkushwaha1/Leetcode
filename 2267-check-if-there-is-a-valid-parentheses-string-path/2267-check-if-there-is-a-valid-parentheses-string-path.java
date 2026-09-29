class Solution {
    Boolean[][][] dp ; 
    public boolean isValid(int startR , int startC , int endR , int endC , char[][] grid , int count  ) {
        // check ( or )
        if ( grid[startR][startC] == '(') {
            count++ ; 
        }
        else{
            count-- ; 
        }

        // count < 0 
        if ( count < 0 ) return false ; 

        // when start == end 
        if(startR == endR && startC == endC ) {
            return count == 0 ; 
        }

        // check dp 
        if(dp[startR][startC][count] != null ) return dp[startR][startC][count] ; 

        boolean ans = false ; 

        if ( startR + 1 <= endR ) {
            ans = isValid(startR+1 , startC , endR , endC , grid , count ) ; 
        }
        if( !ans && startC + 1 <= endC ) {
            ans = isValid(startR , startC + 1  , endR , endC , grid , count ) ; 
        }

        return dp[startR][startC][count] =  ans ; 
    }
    public boolean hasValidPath(char[][] grid) {
        // Taking row and col 
        int r = grid.length ; 
        int c = grid[0].length ; 

        // dp ini..
        dp = new Boolean[r][c][r+c+1] ; // null
        // check grid[0][0]
        if ( grid[0][0] == ')') return false ; 
        // check last 
        if ( grid[r-1][c-1] == '(') return false ; 
        // valid length 
        if ( (r + c - 1 ) % 2 == 1 ) return false ; 


        // check for valid 
        return isValid( 0 , 0 , r-1  , c-1 , grid , 0 ) ; 
    }
}