class Solution {
    public int ans(int[][] arr , int curr , int prev , int[][] dp ) {
       
        if ( curr == arr.length ) {
            return 0 ; 
        }
        if(dp[curr][prev+1] != -1 ) return dp[curr][prev+1] ; 
        // skip 

        int skip = ans(arr , curr+1 , prev,dp) ; 

        // Take 
        int take = 0 ; 
        if ( prev == -1 || (arr[curr][0] > arr[prev][0] && arr[curr][1] > arr[prev][1]) ) {
            take = 1 + ans(arr , curr+1 , curr,dp ) ; 
        } 

        return dp[curr][prev+1] =  Math.max(take,skip) ; 
    }
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes , (a,b) -> {
            if(a[0] == b[0] ) 
                return a[1] - b[1] ;
            return a[0] - b[0] ;
        }) ;
        int[][] dp  = new int[envelopes.length][envelopes.length+1] ; 
        for ( int i = 0 ; i < envelopes.length ; i++ ) {
            Arrays.fill(dp[i],-1) ; 
        } 
        return ans(envelopes , 0 , -1 , dp )  ;
         
    }
}