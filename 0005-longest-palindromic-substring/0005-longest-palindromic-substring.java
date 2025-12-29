class Solution {
    public boolean isValid(String str , int s , int e , boolean[][] dp ) {
        if(dp[s][e] == true ) return true ; 
        while ( s < e ) {
            if(str.charAt(s) == str.charAt(e)) {
                s++ ; 
                e-- ; 
            }
            else {
                return false ; 
            }
        }
        return dp[s][e] =  true ; 
    }
    public String longestPalindrome(String s) {
        int maxLen = 0 ; 
        int idx = -1 ; 
        boolean[][] dp = new boolean[s.length()][s.length()] ; 

        for ( int i = 0 ; i < s.length() ; i++ ) {
            for ( int j = i ; j < s.length() ; j++ ) {
                if(isValid(s,i,j, dp) && maxLen < j - i + 1) {
                    maxLen = j - i + 1 ; 
                    idx = i ; 
                }
            }
        }
        return s.substring(idx , idx+maxLen ) ; 
    }
}