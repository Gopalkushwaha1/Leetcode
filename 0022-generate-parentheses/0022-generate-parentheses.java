class Solution {
    public void find(int open , int close , String ans , int n , List<String> list) {
        if(ans.length() == 2*n ) {
            list.add(ans);
        } 
        if(open < n )find(open+1 , close , ans + '(' , n , list) ; 
        if ( close < open ) find(open , close+1,ans+')' , n , list) ; 
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>() ; 
        find(0,0,"",n,list);
        return list ; 
    }
}