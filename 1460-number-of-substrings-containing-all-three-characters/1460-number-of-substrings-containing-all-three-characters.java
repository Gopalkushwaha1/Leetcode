class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3] ;                         // to count freq for valid check
        int start = 0 , end = 0 , count = 0 ;            // define prerequisite variable
        while ( end < s.length()) {                      // Apply sliding window move end till end 
            int idx = s.charAt(end) ;                    // calculating idx of char 
            arr[idx - 'a']++;                            // increment the idx 
            while(arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 ) {   // count valid ans and slink window
                count += (s.length() - end  ) ;          // update count 
                int startidx = s.charAt(start) ;         // calculating start index 
                arr[startidx - 'a']--;                   // slink the window
                start++;                                 // moving start variable 
            }
            end++ ;                                      // increment the end 
        }
        return count ;                                   // return count 
    }
}