class Solution {
    public boolean checkString(String s) {
        int i = 0 ; 
        while ( i < s.length() && s.charAt(i) != 'b') {
            i++ ; 
        }
        i++;
        if ( i >= s.length()) return true ; 
        while ( i < s.length() ) {
            if ( s.charAt(i) != s.charAt(i-1)) return false ; 
            i++ ;
        }
        return true ; 
    }
}