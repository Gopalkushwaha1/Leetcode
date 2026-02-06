class Solution {
    public int ans(String text1, String text2 , int idx1 , int idx2 , int[][] dp ) {
        if(idx1 < 0 || idx2 < 0 ) return 0 ; 

        if(dp[idx1][idx2] != -1 ) return dp[idx1][idx2] ; 
        int skip = Math.max(ans(text1 , text2 , idx1-1 , idx2 , dp) , Math.max(ans(text1 , text2 , idx1 , idx2-1 , dp ) , ans(text1 , text2 , idx1-1 , idx2-1 , dp ))) ; 
        int take = 0 ; 
        if(text1.charAt(idx1) == text2.charAt(idx2)) {
            take = 1 + ans(text1 , text2 , idx1-1 , idx2-1 , dp ) ; 
        }

        return dp[idx1][idx2] =  Math.max(skip , take ) ; 
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()] ; 
        for(int i = 0 ; i < text1.length() ; i++ ) {
            Arrays.fill(dp[i] , -1 ) ; 
        }
        return ans(text1 , text2 , text1.length()-1 , text2.length() - 1 , dp ) ; 
    }
}