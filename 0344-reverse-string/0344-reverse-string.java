class Solution {
    public void reverseString(char[] s) {
        // define prerequistite Variable 
        int i = 0 , n = s.length ; 
        // swap first to last char 
        while ( i < n ) {
            char c = s[i] ; 
            s[i] = s[n-1] ;
            s[n-1] = c ; 
            i++ ; n-- ; 
        }
    }
}