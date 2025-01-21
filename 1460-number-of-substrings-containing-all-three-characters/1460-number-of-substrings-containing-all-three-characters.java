class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3] ; 
        int start = 0 , end = 0 , count = 0 ; 
        while ( end < s.length()) {
            int idx = s.charAt(end) ;
            arr[idx - 'a']++;
            while(arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 ) {
                count += (s.length() - end  ) ; 
                int startidx = s.charAt(start) ;
                arr[startidx - 'a']--;
                start++;
            }
            end++ ; 
        }
        return count ; 
    }
}