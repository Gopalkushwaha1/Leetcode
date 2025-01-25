class Solution {
    // function to check palindrome     TC -> O(n)
    public boolean isPalindrome(String s ) {
        int start = 0 , end = s.length() ; 
        while(start < end ) {

            if( s.charAt(start) != s.charAt(end - 1 )) return false ;

            start++ ; end-- ;       
        }
        return true ; 

    }
    public int removePalindromeSub(String s) {
        // check if it palindrome then it only take 1 operation
        if(isPalindrome(s)) return 1 ;
        // if not then 2 operation
        else return 2 ; 

    }
}