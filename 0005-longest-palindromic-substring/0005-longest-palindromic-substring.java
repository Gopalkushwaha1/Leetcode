class Solution {
    public boolean isPalindrom(String s , int i , int j ) {
        while ( i < j ) {
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {
                return false ; 
            }
        }
        return true ; 
    }

    public String longestPalindrome(String s) {
        int startIdx = 0 ; 
        int palindromicMaxLen = 0 ; 

        for (int i = 0 ; i < s.length() ; i++ ) {
            for ( int j = i ; j < s.length() ; j++ ) {
                if(isPalindrom(s , i , j ) && palindromicMaxLen < j - i + 1){
                    startIdx = i ; 
                    palindromicMaxLen = j - i + 1 ; 
                }
            }
        }

        String ans = s.substring(startIdx,startIdx+palindromicMaxLen) ; 

        return ans ; 
    }
}