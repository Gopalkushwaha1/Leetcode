class Solution {
    public int countCollisions(String d) {
        Stack<Character> st = new Stack<>() ; 

        int i = 0 ; 
        int count = 0 ; 

        while ( i < d.length() ) {
            char ch = d.charAt(i) ; 
            if(st.isEmpty() || d.charAt(i) == 'R') { 
                st.push(ch) ; 
                i++ ; 
                continue ; 
            }

            else if ( ch == 'L' ) {
                if(st.peek() == 'S') {
                    count++ ; 
                }
                else if(st.peek() == 'R') {
                    count += 2 ; 
                    st.pop() ; 
                    while ( !st.isEmpty() && st.peek() == 'R') {
                        count++ ; 
                        st.pop() ; 
                    }
                    st.push('S') ; 
                }
                else {
                    st.push(ch) ; 
                }
            }

            else {
                if( st.peek() == 'R') {
                    while ( !st.isEmpty() && st.peek() == 'R') {
                        count++ ; 
                        st.pop() ; 
                    }
                }
                st.push('S') ; 
            }
            i++ ; 
        }
        return count ; 
    }
}