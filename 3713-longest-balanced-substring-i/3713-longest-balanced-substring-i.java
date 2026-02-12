class Solution {
    public boolean isValid(int[] freq , int n) {
        for ( int ele : freq ) {
            if(ele == 0 ) continue ; 
            if(ele != n ) return false ; 
        }
        return true ; 
    }
    public int longestBalanced(String s) {
        int maxLen = 0 ;
        int len = s.length() ;  

        for ( int i = 0 ; i < len ; i++ ) {
            if(maxLen >= len - i ) return maxLen ; 
            int[] freq = new int[26] ; 
            for ( int j = i ; j < len ; j++ ) {
                freq[s.charAt(j) - 'a']++ ; 
                if(isValid(freq , freq[s.charAt(j) - 'a'])) maxLen = Math.max(maxLen , j - i + 1 ) ; 
            }
        }
        return maxLen ; 
    }
}