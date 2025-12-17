class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 ; 
        int j = 0 ; 
        int len = 0 ; 
        int[] arr = new int[128] ; 

        while( j < s.length()) {
            arr[s.charAt(j)]++ ; 
            while ( i <= j && arr[s.charAt(j)]>1) {
                arr[s.charAt(i++)]-- ; 
            }
            len = Math.max(len , j - i + 1 ) ; 
            j++ ; 
        }

        return len ; 
    }
}