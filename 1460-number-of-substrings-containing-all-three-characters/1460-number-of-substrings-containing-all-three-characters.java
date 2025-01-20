class Solution {
    public int numberOfSubstrings(String s) {
       int start = 0 ;  
       int end = 0 ; 
       int n = s.length() - 1 ; 
       int count = 0 ;
       int[] arr = new int[3]; 

       while ( end < s.length() ) {
        int idx = s.charAt(end) ; 
        arr[idx - 'a']++ ;
        while ( arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 ) {
            count += n - end + 1 ;
            arr[s.charAt(start) - 'a']--;
            start++;
        }
        end++;
       }
       return count ; 
    }
}