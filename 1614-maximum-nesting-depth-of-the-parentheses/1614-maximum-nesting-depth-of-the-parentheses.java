class Solution {
    public int maxDepth(String s) {
        int parentheses = 0  ; 
        int max = 0 ; 

        // string --> Char 
        for ( char ch : s.toCharArray()) {
            // check if open parent.. 
            if( ch == '(') {
                parentheses++ ; 
                max = Math.max(max , parentheses) ; 
            }
            else if ( ch == ')') {
                parentheses-- ; 
            }
        }

        return max ; 
    }
}