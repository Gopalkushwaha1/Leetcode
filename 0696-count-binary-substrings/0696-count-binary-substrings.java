class Solution {
    public int countBinarySubstrings(String s) {
        // Define prerequisite variable
        int count = 0 , currGroup = 1 , prevGroup = 0 ; 

        // find diff group ( continues 0 or 1 )    
        for ( int i = 1 ; i < s.length() ; i++ ) {
            // if same value update curr Group 
            if ( s.charAt(i) == s.charAt(i-1) ) currGroup++ ; 
            // update count 
            else {
                count += Math.min ( prevGroup , currGroup ) ;
                prevGroup = currGroup ; 
                currGroup = 1 ; 
            }
        } 

        return count + Math.min( prevGroup , currGroup ) ; 
    }
}