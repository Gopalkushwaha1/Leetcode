class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = 0 ; 
        for ( int i = 0 ; i < k ; i++ ) {
            if( blocks.charAt(i) == 'W'){
                ans++;
            }
        }
        int result = ans ; 
        int start = 0 , end = k ; 

        while ( end < blocks.length() ) {
            if ( blocks.charAt(end) == 'W'){
                ans++;
            }
            if ( blocks.charAt(start) == 'W') {
                ans--;
            }
            result = Math.min(result , ans ) ;
            end++;
            start++;
        }
        return result ; 
    }
}