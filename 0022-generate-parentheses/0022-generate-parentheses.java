class Solution {
    public void getAll(StringBuilder sb , int open , int close , int n , List<String> list ) {
        if(close > open || open > n ) return ; 
        if(open + close == 2*n) {
            list.add(sb.toString()) ; 
            return ; 
        }
        StringBuilder sb1 = new StringBuilder(sb) ; 
        StringBuilder sb2 = new StringBuilder(sb) ; 
        getAll(sb1.append("(") , open+1 , close , n , list ) ; 
        getAll(sb2.append(")") , open , close+1 , n , list ) ; 
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder() ; 
        sb.append("(") ; 
        List<String> list = new ArrayList<>() ; 
        getAll(sb , 1 , 0 , n , list ) ; 
        return list ; 
     }
}