class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128] ; 

        int i = 0 ; 
        int j = 0 ;
        int ans = 0 ;  

        while ( i < s.length() ) {
            char ch = s.charAt(i) ; 
            arr[ch]++ ; 
            while ( arr[ch] > 1 ) {
                char ch2 = s.charAt(j++) ; 
                arr[ch2]-- ; 
            }
            ans = Math.max(ans , i -j + 1 ) ; 
            i++ ; 
        }

        return ans ; 
    }
}