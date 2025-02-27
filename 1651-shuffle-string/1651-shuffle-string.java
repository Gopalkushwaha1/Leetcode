class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()] ; 

        for ( int i = 0 ; i < str.length ; i++ ) {
            char ch = s.charAt(i) ; 
            int idx = indices[i] ; 
            str[idx] = ch ; 
        }

        return new String(str) ;
    }
}