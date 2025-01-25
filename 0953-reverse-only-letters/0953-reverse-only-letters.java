class Solution {
    public void reverse(char[] ch , int start , int end) {

        while ( start < end ) {
            while (start < ch.length &&  (ch[start] < 65 || (ch[start] > 90  && ch[start] < 97 )) ) {
                start++ ; 
            }
            while ( end >= 0 &&  (ch[end] < 65 || (ch[end] > 90 && ch[end] < 97 )) ) {
                end-- ; 
            }
            if(start >= end ) break ; 
            char c = ch[start] ; 
            ch[start] = ch[end] ;
            ch[end] = c ; 
            start++ ; end-- ; 
        }
    }
    public String reverseOnlyLetters(String s) {

        char[] ch = s.toCharArray() ; 
        reverse(ch , 0 , s.length()-1) ; 
        return  new String(ch);

    }
}