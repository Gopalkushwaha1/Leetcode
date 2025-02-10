class Solution {
    public int lengthOfLongestSubstring(String s) {
        if ( s.length() <= 1 ) return s.length() ; 
        int[] ans = new int[128] ; 
        int i = 0 , j = 0 , result = 0 ; 

        while ( j < s.length() ) {
            int c = s.charAt(j) ; 
            ans[c]++ ; 

            while ( ans[c] > 1 ) {
                int ch = s.charAt(i) ; 
                ans[ch]--;
                i++ ; 
            }
            result = Math.max ( result , j - i + 1 ) ; 
            j++ ; 
        }
        return result ; 
    }
}