class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128] ;
        int start  = 0 ;
        int end = 0 ;

        int len = 0 ;
        
        while ( end < s.length() ) {
            int idx = s.charAt(end) ;
            arr[idx]++ ;
            while (arr[idx] > 1 ) {
                arr[s.charAt(start)]--;
                start++ ;
            }
            len = Math.max(len , end - start + 1 );
            end++ ;
        }
        return len ;
    }
}