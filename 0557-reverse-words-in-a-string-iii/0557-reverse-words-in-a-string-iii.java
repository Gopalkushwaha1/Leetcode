class Solution {
    public void reverse( char[] ch , int start  , int end ) {
        while ( start < end ) {
            char c = ch[start] ;
            ch[start] = ch[end-1] ; 
            ch[end-1] = c ; 
            start++ ; end-- ; 
        }
    }
    public String reverseWords(String s) {
        char[] ch = s.toCharArray() ; 
        int i = 0 , j = 0 ; 

        while ( i < s.length() ) {
            
            while ( i < s.length() && s.charAt(i) != ' ' ) {
                i++ ; 
            }

            reverse ( ch , j , i ) ; 
            i++ ;
            j = i ; 

        }
        return new String(ch) ; 
    }
}