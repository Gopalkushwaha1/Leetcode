class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>() ; 

        for ( int i = 0 ; i < s.length() ; i++ ) {
            int ascii = s.charAt(i) ; 

            if ( ascii < 97 ) {
                st.pop() ; 
                continue ; 
            }
            else {
                st.push(s.charAt(i)) ; 
            }
        }
        StringBuilder sb = new StringBuilder() ; 
        while ( st.size() != 0 ) {
            sb.append(st.pop()) ; 
        }

        return sb.reverse().toString() ; 
    }
}