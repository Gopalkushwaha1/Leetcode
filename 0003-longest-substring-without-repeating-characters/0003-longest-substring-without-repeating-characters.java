class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1 ) return s.length() ; 
        int[] arr = new int[128] ; 
        int start = 0 , end = 0 , len = 0 ; 

        while ( end < s.length() ) {
            arr[s.charAt(end)]++ ; 

            while ( arr[s.charAt(end)] > 1 ) {
                arr[s.charAt(start)]--;
                start++ ; 
            }
            len = Math.max ( len , end - start + 1 ) ;
            end++ ; 
        }
        return len ; 
    }
}