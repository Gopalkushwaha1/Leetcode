class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Character> ch = new Stack<>() ; 
        Stack<Integer> st = new Stack<>() ; 
        int ans = 0 ; 

        ch.add(colors.charAt(0));
        st.add(neededTime[0]) ; 

        for ( int i = 1 ; i < colors.length() ; i++ ) {
            if(ch.peek() == colors.charAt(i)){
                ans += Math.min(st.peek() , neededTime[i]);
                st.push(Math.max(st.pop() , neededTime[i]) ); 
            }
            else {
                ch.add(colors.charAt(i));
                st.add(neededTime[i]) ; 
            }
        }
        return ans ; 
    }
}