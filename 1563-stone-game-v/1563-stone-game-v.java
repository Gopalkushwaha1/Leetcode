class Solution {
    int[] prefix ; 
    int[][] dp ; 
    public int stoneGameV(int[] stoneValue) {
        
        int n = stoneValue.length ; 
        prefix = new int[n+1] ; 

        dp = new int[n][n] ; 

        // fill the dp 
        for ( int i = 0 ; i < n ; i++ ) {
            Arrays.fill(dp[i] , -1 ) ; 
        }

        // fill the prefix 
        for ( int i = 0 ; i < n ; i++ ) {
            prefix[i+1] = prefix[i] + stoneValue[i] ; 
        }

        return solve(0 , n-1) ; 
    }

    public int solve ( int left , int right ) {

        // if left == right return 0 
        if( left == right ) return 0 ; 

        if( dp[left][right] != -1 ) return dp[left][right] ; 
        int ans = 0 ; 

        // now travel stoneValue split at each index 
        for ( int i = left ; i < right ; i++ ) {

            // take left and right sum 
            int leftSum = prefix[i+1] - prefix[left] ; 
            int rightSum = prefix[right+1] - prefix[i + 1 ] ; 

            if( leftSum < rightSum ) {
                ans = Math.max(ans , leftSum + solve( left, i )) ; 
            }
            else  if ( rightSum < leftSum ) {
                ans = Math.max( ans , rightSum + solve( i+1 , right )) ; 
            }
            else {
                ans = Math.max( ans , Math.max(leftSum + solve(left, i) , rightSum + solve(i+1 , right ))) ; 
            }
        }
        dp[left][right] = ans ; 
        return ans ; 
    }
}