class Solution {
    public void reverse(char[] ch  , int start , int end ) {
        while ( start < end ) {
            char c = ch[start] ;
            ch[start] = ch[end-1] ;
            ch[end-1] = c ; 
            start++ ; end-- ;  
        } 
    }
    public String reversePrefix(String word, char ch) {
        // define prerequisite variable 
        int findMatch = 0 ; 
        for ( int i = 0 ; i < word.length() ; i++ ) {
            // if char match then take that index and break the loop
            if( word.charAt(i) == ch ) {               
                findMatch = i ; 
                break ; 
            }
        }
        // no match char return same string 
        if ( findMatch == 0 ) return word ; 
        // change string to char Array ( we canot change string dirctly)
        char[] c = word.toCharArray() ; 
        // Reverse String 0 to match index 
        reverse( c , 0 , findMatch + 1 ) ; 

        return new String(c) ; 
    }
}