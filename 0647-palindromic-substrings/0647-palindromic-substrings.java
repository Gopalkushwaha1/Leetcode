class Solution {
    int[][] dp ;
    public boolean isPalindrome(String s , int i , int j ) {
        if( i > j ) return true ; 
        if(dp[i][j] != -1 ) return dp[i][j] == 0 ; 

        if(s.charAt(i) != s.charAt(j)) {
            return false ; 
        }
        else {
            boolean c =  isPalindrome(s,i+1 , j-1 ) ; 
            dp[i][j] = c == true ? 0 : 1 ; 
        }
        return dp[i][j] == 0 ; 
    }
    public int countSubstrings(String s) {
        dp = new int[1001][1001] ; 
        for ( int i = 0 ; i < 1001 ; i++ ) {
            Arrays.fill(dp[i] , -1) ; 
        }
        int count = 0 ; 

        for ( int i = 0 ; i < s.length() ; i++ ) {
            for  ( int j = i ; j < s.length() ; j ++ ) {
                if( isPalindrome(s,i,j) ) {
                    count++ ; 
                }
            }
        }
        return count ; 
    }
}