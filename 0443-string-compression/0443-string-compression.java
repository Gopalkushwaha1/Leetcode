class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder() ; 
        int i = 0 , j = 0 ; 

        while ( j < chars.length ) {
            if ( j == chars.length - 1 || chars[i] != chars[j+1]) {
                sb.append(chars[i]) ; 
                if ( j - i + 1 > 1 ) {
                    sb.append(j-i+1) ; 
                }
                i = j + 1 ; 
            }
            j++ ; 
        }
        for ( int k = 0 ; k < sb.length() ; k++ ) {
            chars[k] = sb.charAt(k) ; 
        } 
        return sb.length() ; 
    }
}