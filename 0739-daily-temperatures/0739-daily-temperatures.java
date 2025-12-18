class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length] ; 

        Stack<Integer> st = new Stack<>() ; 

        for ( int i = 0 ; i < t.length ; i++ ) {
            if ( st.isEmpty() || t[st.peek()] > t[i]) {
                st.push(i) ; 
                continue ; 
            }
            while(!st.isEmpty() && t[st.peek()] < t[i]) {
                ans[st.peek()] = i - st.peek() ; 
                st.pop() ; 
            }
            st.push(i) ; 
        }
        return ans ; 
    }
}