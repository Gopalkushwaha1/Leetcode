class Solution {
    public boolean isValid(String str1 , String str2 ) {
        if ( str2.length() - str1.length() != 1 ) return false ; 

        int s = 0 ; 
        int e = 0 ; 
        int count = 0 ; 

        while ( s < str1.length() && e < str2.length() ) {
            if(str1.charAt(s) == str2.charAt(e)) {
                s++ ; 
                e++ ; 
                continue ; 
            }
            else {
                count++ ; 
                e++ ; 
                if ( count > 1 ) return false ; 
            }
        }
        return true ; 
    }
    public int ans( String[] word , int prev , int curr , int[][] dp ) {
        if ( curr == word.length ) {
            return 0 ; 
        }
        if(dp[prev+1][curr] != -1 ) return dp[prev+1][curr] ; 
        int skip = ans(word , prev , curr+1 , dp ) ; 
        int take = 0 ; 

        if ( prev == -1 || isValid(word[prev] , word[curr])) {
            take = 1 + ans(word , curr , curr + 1 , dp ) ; 
        }

        return dp[prev+1][curr] =  Math.max(skip , take ) ; 
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words , ( a,b) -> a.length() - b.length()) ; 
        int[][] dp = new int[words.length][words.length] ; 
        for ( int i = 0 ; i < words.length ; i++ ) {
            Arrays.fill(dp[i] , -1 ) ; 
        }
        return ans(words , -1 , 0 , dp ) ; 
    }
}