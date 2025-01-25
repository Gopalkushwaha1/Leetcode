class Solution {
    public String reverseWords(String s) {
        // define prerequistie varible 
        int i = 0 ; 
        Stack<Character> st = new Stack<>() ; 
        String ans = "" ; 

        while ( i < s.length() ) {
            // push char in stack until space not came 
            while (i < s.length() &&  s.charAt(i) != ' ' ) {
                st.push(s.charAt(i));
                i++ ; 
            }
            // poll from stack add in answer 
            while ( st.size() != 0 ) {
                char c = st.pop() ; 
                ans += c ;
            }
            // check string s have more word then add space 
            if ( i != s.length()) {
                ans += ' ' ; 
            }
            i++ ; 
        }
        
        return ans ; // return ans 
    }
}