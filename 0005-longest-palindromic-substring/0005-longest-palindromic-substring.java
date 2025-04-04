class Solution {
    public boolean isPalindrom(String s , int i , int j , int[][] check) {
        if ( i >= j ) {
           return true ; 
        } 

        if ( check[i][j] != -1 ) return check[i][j] == 1 ; 

        if(s.charAt(i) == s.charAt(j) && isPalindrom(s,i+1,j-1,check)) {
            return (check[i][j] = 1) == 1 ; 
        }

        return (check[i][j] = 0) == 1 ; 
    }

    public String longestPalindrome(String s) {
        int startIdx = 0 ; 
        int palindromicMaxLen = 0 ; 
        int[][] check = new int[s.length()][s.length()];
        for ( int i = 0 ; i < s.length() ; i++ ) {
            Arrays.fill(check[i] , -1 ) ; 
        }

        for (int i = 0 ; i < s.length() ; i++ ) {
            for ( int j = i ; j < s.length() ; j++ ) {
                if(isPalindrom(s , i , j , check) && palindromicMaxLen < j - i + 1){
                    startIdx = i ; 
                    palindromicMaxLen = j - i + 1 ; 
                }
            }
        }

        String ans = s.substring(startIdx,startIdx+palindromicMaxLen) ; 

        return ans ; 
    }
}