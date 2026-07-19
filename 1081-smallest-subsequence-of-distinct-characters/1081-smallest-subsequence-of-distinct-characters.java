class Solution {
    public String smallestSubsequence(String s) {
        // Last Idx array track 

        int[] lastIdx = new int[26] ; 
        boolean[] check = new boolean[26] ; 


        // fill last idx 

        for ( int i = 0 ; i < s.length() ; i++ ) {
            lastIdx[ s.charAt(i) - 'a'] = i ; 
        }

        // create stack 
        Stack<Character> stack = new Stack<>() ; 

        // travel to string 
        for ( int i = 0 ; i < s.length() ; i++ ) {

            char ch = s.charAt(i) ; // curr char 

            if( check[ch-'a'] ) continue ; // check if alredy exit then continue 

            while ( !stack.isEmpty()  
                && stack.peek() > ch 
                && lastIdx[ stack.peek() - 'a'] > i ) {

                    check[stack.pop() - 'a'] = false ; 

                }
            stack.push(ch) ; 
            check[ch-'a'] = true ;     
        }

        StringBuilder sb = new StringBuilder() ; 

        for ( char ch : stack ) {
            sb.append(ch) ; 
        }

        // return ans 
        return sb.toString() ; 
    }
}