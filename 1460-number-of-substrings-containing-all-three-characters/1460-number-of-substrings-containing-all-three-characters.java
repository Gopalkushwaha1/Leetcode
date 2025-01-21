class Solution {
    public int numberOfSubstrings(String s) {
      int a = -1 , b = -1 , c = -1 , idx = 0 , count = 0 ; 

      while ( idx < s.length() ) { 

        if ( s.charAt(idx) == 'a') a = idx ; 

        else if ( s.charAt(idx) == 'b' ) b = idx ; 

        else c = idx ; 

        if ( a >= 0 && b >= 0 && c >= 0 ) {

            count += ( Math.min( a , Math.min( b , c ) ) + 1 ) ; 
        }

        idx++ ; 
        
      }
      return count ; 
    }
}