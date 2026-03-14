class Solution {
    int count = 0 ; 
    String ans = "" ; 
    public void find(int n , int k , StringBuilder sb ) {
        // early check 
        if(ans.length() > 0 ) return ; 
        // check curr size == n 
        //     then we start count our string 

        if(sb.length() == n ) {
            count++ ; 

            // if count == k 
            //     we got the string we return 
            if(count == k ) {
                ans = sb.toString() ; 
            }
            return ; 
        }

        // add and remove string 
        for ( char ch : new char[]{'a','b','c'}) {
            // check condition before add 
            if(sb.length() == 0 || sb.charAt(sb.length()-1) != ch ) {
                sb.append(ch) ; 
                find(n , k , sb ) ; 
                sb.deleteCharAt(sb.length()-1) ;   // backtrack 
            }
        }
    }
    public String getHappyString(int n, int k) {
        find(n , k , new StringBuilder()) ; 
        return ans ; 
    }
}