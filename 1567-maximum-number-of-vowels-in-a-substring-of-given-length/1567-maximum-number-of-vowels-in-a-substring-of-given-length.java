class Solution {
    public boolean isVowel( char c ) {
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true ;
        else return false ; 
    }
    public int maxVowels(String s, int k) {
        int start = 0 , end = 0 , count = 0 , maxCount = 0 ;

        while ( end < k ) {
            if (isVowel(s.charAt(end))) {
                count++ ; 
            }
            end++ ; 
        }
        maxCount = Math.max( count , maxCount) ;

        while ( end < s.length() ) {

            if ( isVowel(s.charAt(end) )) {
                count++ ; 
            }
            if ( isVowel(s.charAt(start))) {
                count-- ; 
            }
            maxCount = Math.max( count , maxCount) ; 
            end++ ; start++ ; 
        }
        return maxCount ; 
    }
}