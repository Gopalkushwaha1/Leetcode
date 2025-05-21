class Solution {
    public void find(List<String> ans , int n , int s , int c , String str ) {
        if( str.length() == 2*n ) {
            ans.add(str) ;
            return ; 
        }
        if( s > 0 ) {
            find(ans ,n, s-1 , c , str + "(");
        }
        if (( s - c ) < 0 ) 
            find( ans ,n, s , c-1 , str + ")") ; 
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>() ; 

        find( ans , n ,  n ,n ,  "") ; 
        return ans ; 
    }
}