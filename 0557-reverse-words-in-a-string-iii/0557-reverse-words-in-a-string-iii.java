class Solution {
    public void reverse( char[] ch , int start , int end ) {
        end-- ; 
        while ( start < end ) {
            char c = ch[start] ;
            ch[start] = ch[end] ;
            ch[end] = c ; 
            start++ ; end-- ; 
        }
    }
    public String reverseWords(String s) {
        int start = 0 ; 
        char[] ch = s.toCharArray();
        int n = s.length() ; 

        for ( int i = 0 ; i <= n ; i++ ) {

            if ( i == n || ch[i] == ' ') {

                reverse ( ch , start , i ) ; 
                start = i + 1 ; 
            }
        }
        return new String(ch) ; 
    }
}