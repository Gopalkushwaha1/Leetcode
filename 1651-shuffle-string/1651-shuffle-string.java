class Solution {
    public String restoreString(String s, int[] indices) {
        Character[] str = new Character[s.length()] ; 

        for ( int i = 0 ; i < str.length ; i++ ) {
            char ch = s.charAt(i) ; 
            int idx = indices[i] ; 
            str[idx] = ch ; 
        }
        StringBuilder sb = new StringBuilder() ; 
        for ( Character ch : str ) {
            sb.append(ch) ; 
        }

        return sb.toString() ;
    }
}