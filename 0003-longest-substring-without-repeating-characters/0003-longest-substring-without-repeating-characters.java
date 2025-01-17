class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ; 
        int end = 0 ; 
        int len = 0 ;

        int[] arr = new int[128] ;
        while ( end < s.length() ) {
            int diff = s.charAt(end) ;
            arr[diff]++ ;

            while ( arr[diff] > 1 ) {
                arr[s.charAt(start)]--;
                start++;
            }
            len = Math.max(len , end - start + 1 );
            end++;
        }
        return len ; 
    }
}