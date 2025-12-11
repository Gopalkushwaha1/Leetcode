class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1] ; 
        if ( s == null || s.charAt(0) == '0') return 0 ; 

        dp[0] = 1 ; 
        dp[1] = 1 ; 

        for ( int i = 2 ; i <= s.length() ; i++ ) {
            char curr = s.charAt(i-1) ; 
            char prev = s.charAt(i-2) ;

            if ( curr != '0') {
                dp[i] += dp[i-1] ; 
            } 

            if ( prev == '1' || ( prev == '2' && curr <= '6')){
                dp[i] += dp[i-2] ; 
            }
        }

        return dp[s.length()] ; 
    }
}