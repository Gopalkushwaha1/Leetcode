class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1 , second = -1 ; 

        for ( int i = 0 ; i < s1.length() ; i++ ) {
            if ( s1.charAt(i) != s2.charAt(i)) {
                if ( first == -1 ) first = i ;   // We got our first unequal char 
                else if (second == -1) second = i ;   // get 2nd unequal char 
                else return false ;  // More than two char diff 
            }
        }
        if ( first == -1 ) return true ; // It means it already sorted 
        if ( second == - 1 ) return false ;  // It means only 1 char is different 

        // Check for Alternate char 
        return s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first) ; 
    }
}