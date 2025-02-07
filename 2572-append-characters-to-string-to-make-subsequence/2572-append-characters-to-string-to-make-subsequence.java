class Solution {
    public int appendCharacters(String s, String t) {
         int slen = s.length() ;   // length of s
         int tlen = t.length() ;   // length of t
         int i = 0 , j = 0 ;       // Variable to track how both string simliar 
        // Checking similarity 
         while ( j < tlen && i < slen ) {
             if ( s.charAt(i) == t.charAt(j)){
                j++; 
             }
             i++ ; 
         } 
         // return total length - unsimilarity 
         return tlen - j ; 
    }
}