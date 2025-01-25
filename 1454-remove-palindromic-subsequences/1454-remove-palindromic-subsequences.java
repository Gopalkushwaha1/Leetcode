class Solution {
    public boolean isPalindrome(String s ) {
        int start = 0 , end = s.length() ; 
        while(start < end ) {

            if( s.charAt(start) != s.charAt(end - 1 )) return false ;

            start++ ; end-- ;       
        }
        return true ; 

    }
    public int removePalindromeSub(String s) {
        
        if(isPalindrome(s)) return 1 ;

        else return 2 ; 

    }
}