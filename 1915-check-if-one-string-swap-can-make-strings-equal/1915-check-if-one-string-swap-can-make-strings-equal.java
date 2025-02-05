class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int idx = 0 ; 
        
        for  (idx = 0 ; idx < s1.length() ; idx++ ) {
            if ( s1.charAt(idx) != s2.charAt(idx)) {
                break ; 
            }
        }
        if ( idx == s1.length()) return true ; 
        char c1 = s1.charAt(idx) ;
        char c2 = s2.charAt(idx) ; 
        int i = 0 ; 
        for ( i = idx + 1 ; i < s1.length() ; i++ ) {
            if ( s1.charAt(i) != s2.charAt(i)) {
                break ; 
            }
        }
        if ( i == s1.length()) return false ; 
        char c11 = s1.charAt(i) ; 
        char c22 = s2.charAt(i) ; 

        if ( c1 != c22 || c2 != c11 ) return false ; 

        for ( int j = i+1 ; j < s1.length() ; j++ ) {
            if ( s1.charAt(j) != s2.charAt(j)) return false ; 
        }
        return true ; 
    }
}