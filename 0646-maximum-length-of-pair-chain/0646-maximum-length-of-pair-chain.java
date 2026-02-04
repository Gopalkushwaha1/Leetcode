class Solution {
    public int ans(int[][] pairs , int curr , int prev , int[][] dp ) {
        if( curr == pairs.length ) return 0 ; 
        if(dp[curr][prev+1] != -1 ) return dp[curr][prev+1] ; 

        int skip = ans(pairs , curr + 1 , prev , dp ) ; 

        int take = 0 ; 

        if(prev == -1 || pairs[curr][0] > pairs[prev][1]) {
            take = 1 + ans(pairs , curr+1 , curr , dp ) ; 
        }

        return dp[curr][prev+1] =  Math.max(skip , take ) ; 
    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs , (a,b) -> {
            return a[0] - b[0] ; 
        }) ; 
        int[][] dp = new int[pairs.length][pairs.length+1] ; 
        for ( int i = 0 ; i < pairs.length ; i++ ) {
            Arrays.fill(dp[i] , -1 ) ; 
        }
        return ans(pairs , 0 , -1 , dp ) ; 
    }
}