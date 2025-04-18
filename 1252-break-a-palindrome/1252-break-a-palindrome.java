class Solution {
    public String breakPalindrome(String s) {
        if ( s.length() == 1 ) return "" ; 
        char[] ch = s.toCharArray() ; 
        for ( int i = 0 ; i < s.length()/2 ; i++ ) {
            if(ch[i] != 'a'){
                ch[i] = 'a' ; 
                String str = new String(ch) ; 
                return str ; 
            }
        }
        ch[s.length()-1] = 'b' ;
        String str = new String(ch) ; 
        return str ; 
    }
}