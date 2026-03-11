class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0  ; 
        int j = 0 ; 
        int ans = 0 ; 

        int[] arr = new int[26] ; 

        while ( i < s.length() ) {
            char ch = s.charAt(i) ; 

            arr[ch-'a']++ ; 
            while(arr[ch-'a'] > 1 ) {
                char prev = s.charAt(j) ; 
                arr[prev-'a']-- ; 
                j++ ; 
            }
            ans = Math.max(ans , i - j + 1 ) ; 
            i++ ; 
        }
        return ans ; 
    }
}