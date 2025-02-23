class Solution {
    public boolean check(String s ) {
        Stack<Character> st = new Stack<>() ; 
        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( st.size() > 0 ) {
                if(st.peek() == '(' && s.charAt(i) == ')'){
                    st.pop();
                }
                else if ( st.peek() == '(' && s.charAt(i) == '('){
                    st.push(s.charAt(i));
                }
                else {
                    return false ; 
                }
            }
            else {
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty() ; 
    }
    public void generate(int n , List<String> ans , String s) {
        if ( s.length() == 2 * n ) {
            if(check(s)){
                ans.add(s);
            }
            return ; 
        }
        if ( s.isEmpty()){
            generate(n,ans,s+'(');
        }
        else {
            generate(n,ans,s+'(');
            generate(n,ans,s+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>() ; 
        generate(n , ans , "") ; 
        return ans ; 
    }
}