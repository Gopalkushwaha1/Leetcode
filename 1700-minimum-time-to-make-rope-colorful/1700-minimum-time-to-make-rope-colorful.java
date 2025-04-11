class Solution {
    public int minCost(String colors, int[] need) {
        Stack<Character> st = new Stack<>() ; 
        Stack<Integer> st2 = new Stack<>() ; 
        int ans = 0 ; 
        char[] ch = colors.toCharArray();
        st.push(ch[0]);
        st2.push(need[0]);
        for ( int i = 1 ; i < colors.length() ; i++ ) {
            char c = ch[i] ; 
            char top = st.peek() ; 
            if(top == c && need[i] <= st2.peek()) {
                ans += need[i] ; 
                continue;
            }
            else if( top == c && need[i] > st2.peek()){
                st.pop() ; 
                ans += st2.pop() ;
            }
            st.add(c);
            st2.add(need[i]) ; 
        } 
        return ans ; 
    }
}