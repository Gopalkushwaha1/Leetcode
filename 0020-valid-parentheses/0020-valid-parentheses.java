class Solution {
    public boolean isValid(String s) {
        // Create stack to track valid parentheses 
        Stack<Character> st = new Stack() ; 

        if ( st.size() % 2 != 0 ) return false ; 

        // travel each parentheses
        for ( char ch : s.toCharArray() ) {
            // if opening parentheses then push to stack 
            if ( ch == '(' || ch == '{' || ch == '[') {
                st.push(ch) ; 
            }
            else if ( ch == ')') {
                if (st.isEmpty()) return false  ;
                char prev = st.peek() ; 
                if( prev == '(') {
                    st.pop() ; 
                    continue ; 
                }
                else {
                    return false ; 
                }
            }
            else if ( ch == '}') {
                if (st.isEmpty()) return false  ;
                char prev = st.peek() ; 
                if( prev == '{') {
                    st.pop() ; 
                    continue ; 
                }
                else {
                    return false ; 
                }
            }
            else if ( ch == ']') {
                if (st.isEmpty()) return false  ;
                char prev = st.peek() ; 
                if( prev == '[') {
                    st.pop() ; 
                    continue ; 
                }
                else {
                    return false ; 
                }
            }
        }

        return st.isEmpty() ; 
    }
}