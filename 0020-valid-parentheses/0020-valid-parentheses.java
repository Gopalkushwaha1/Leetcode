class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>() ; 

        for ( char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch) ; 
            }
            else {
                if ( st.isEmpty()) return false ; 
                char c = st.peek() ; 
                if( c == '(' && ch != ')') return false ; 
                else if ( c == '[' && ch != ']') return false ; 
                else if( c == '{' && ch != '}') return false ; 
                else {
                    st.pop() ; 
                }
            }
        }

        return st.isEmpty() ; 
    }
}