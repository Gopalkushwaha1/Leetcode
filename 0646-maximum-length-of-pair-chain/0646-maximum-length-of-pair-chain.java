class Solution {
    public int ans(int[][] arr , int curr , int prev , int[][] dp ) {
        // base case 
        if( curr == arr.length ) {
            return 0 ; 
        }

        if ( dp[curr][prev+1] != -1 ) return dp[curr][prev+1] ; 
        int skip = ans(arr , curr+1 , prev , dp ) ; 

        int take = 0 ; 
        if ( prev == -1 || ( arr[curr][0] > arr[prev][1])) {
            take = 1 + ans(arr , curr+1 , curr , dp ) ; 
        }

        return dp[curr][prev+1] =  Math.max(skip , take ) ; 
    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs , (a,b) -> {
            if ( a[0] == b[0] ) 
                return b[0] - a[0] ;  
            return a[0] - b[0]  ;   
        });
        int[][] dp = new int[pairs.length][pairs.length+1] ; 

        for (  int i = 0 ; i < pairs.length ; i++ ) {
            Arrays.fill(dp[i] , -1) ; 
        }
        return ans(pairs , 0 , -1 , dp ) ; 
    }
}