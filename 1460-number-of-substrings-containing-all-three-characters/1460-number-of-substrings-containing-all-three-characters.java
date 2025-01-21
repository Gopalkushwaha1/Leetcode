class Solution {
    public int numberOfSubstrings(String s) {
        int a = 0 , b = 0 , c = 0 ;
        // int[] arr = new int[3] ;                         // to count freq for valid check
        int start = 0 , end = 0 , count = 0 ;            // define prerequisite variable
        while ( end < s.length()) {                      // Apply sliding window move end till end 
            if(s.charAt(end) == 'a')a++;
            else if(s.charAt(end) == 'b')b++;
            else c++ ;                            // increment the idx 
            while(a >= 1 && b >= 1 && c >= 1 ) {   // count valid ans and slink window
                count += (s.length() - end  ) ;          // update count 
                if(s.charAt(start) == 'a')a--;
                else if(s.charAt(start) == 'b')b--;
                else c--;                  // slink the window
                start++;                                 // moving start variable 
            }
            end++ ;                                      // increment the end 
        }
        return count ;                                   // return count 
    }
}