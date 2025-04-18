class Solution {
    public String breakPalindrome(String s) {
        if(s.length() == 1 ) return "" ; 
        char[] ch = s.toCharArray() ; 
        int i = 0 , count = 0 ; 
        for ( i = 0 ; i < ch.length ; i++ ) {
            if(s.length()%2 != 0 && i == s.length()/2) continue ; 
            if(ch[i] != 'a') {
                ch[i] = 'a' ; 
                String ans = new String(ch) ; 
                return ans ;
            } 
        }
        ch[s.length() - 1] = 'b' ;
        String ans = new String(ch) ; 
        return ans ;

         
    }
}