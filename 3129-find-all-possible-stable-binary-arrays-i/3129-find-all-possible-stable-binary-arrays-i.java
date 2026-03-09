class Solution {
    static int[][][][] dp ; 
    static int mod = 1_000_000_007 ; 
    public int find(int zeroLeft , int oneLeft , int curr , int count , int limit ) {

        // if zeroCount && one Left == 0 then 1 way we get

        if(zeroLeft == 0 && oneLeft == 0 ) {
            return 1 ; 
        }

        // early check by dp 
        if(dp[zeroLeft][oneLeft][curr][count] != -1 ) return dp[zeroLeft][oneLeft][curr][count] ; 
        int ways = 0 ; 

        // for zero call and check 
        if(zeroLeft > 0 ) {

            // check curr was 0 then count + 1 
            if(curr == 0 ) {
                // check vaild limit 
                if(count + 1 <= limit ) {
                    ways += find(zeroLeft - 1 , oneLeft , 0 , count+1 , limit ) % mod ; 
                }
            }
            else {
                // when zero first time came 
                ways += find(zeroLeft-1 , oneLeft , 0  , 1 , limit ) % mod  ;    
            }
        }

        // for one call and check 

        if(oneLeft > 0 ) {

            // check curr was 1 then count + 1 
            if(curr == 1 ) {
                // check valid 
                if(count + 1 <= limit ) {
                    ways += find(zeroLeft , oneLeft-1 , 1 , count+1 , limit ) % mod  ; 
                }
            }
            else {
                // one came first time 
                ways += find(zeroLeft , oneLeft-1 , 1 , 1 , limit )%mod ; 
            }
        }

        return dp[zeroLeft][oneLeft][curr][count] = ways ; 
    }
    public int numberOfStableArrays(int zero, int one, int limit) {
        // dp 
        dp = new int[zero+1][one+1][2][limit+1] ; 

        //fill the dp 
        for ( int i = 0 ; i <= zero ; i++ ) {
            for ( int j = 0 ; j <= one ; j++ ) {
                for ( int k = 0 ; k < 2 ; k++ ) {
                    for ( int l = 0 ; l <= limit ; l++ ) {
                        dp[i][j][k][l] = -1 ; 
                    }
                }
            }
        }
        // way 

        int ways = 0 ; 

        // call for 0 
        if(zero > 0 ) {
            ways += find(zero-1 , one , 0 , 1 , limit ) % mod ;
        }

        // call for 1 

        if(one > 0 ) {
            ways += find(zero , one - 1 , 1 , 1 , limit ) % mod  ; 
        }

        // return 
        return ways ; 
    }
}