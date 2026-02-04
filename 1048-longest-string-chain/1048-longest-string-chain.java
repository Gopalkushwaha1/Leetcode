class Solution {
    public boolean isValid(String str1 , String str2 ) {
        if(str1.length() + 1 != str2.length()) return false ; 
        int i = 0 ; 
        int j = 0 ; 

        while ( i < str1.length() && j < str2.length() ) {
            if(str1.charAt(i) != str2.charAt(j))j++ ;
            else{
                i++ ; 
                j++ ; 
            }
        } 
        return i+1 == j || i == j  ; 
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words , (a,b) -> {
            return a.length() - b.length() ; 
        }) ; 
        int[] dp = new int[words.length] ; 
        

        for ( int i = 0 ; i < words.length ; i++ ) {
            for ( int j = 0 ; j < i ; j++ ) {
                if(isValid(words[j] , words[i])) {
                    dp[i] = Math.max(dp[i] , dp[j]+1) ; 
                }
            }
        }

        int max = 0 ; 
        for ( int ele : dp ) {
            if(ele > max ) max = ele ; 
        }

        return max+1 ; 
    }
}