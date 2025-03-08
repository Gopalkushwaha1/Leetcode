class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0 ; 

        for ( int i = 0 ; i < k ; i++ ) {
            if ( blocks.charAt(i) == 'W') whiteCount++;
        }

        int minWhiteCount = whiteCount ; 
        int start = 0 , end = k ; 

        while( end < blocks.length()){
            if ( blocks.charAt(end) == 'W') whiteCount++ ;
            if ( blocks.charAt(start) == 'W') whiteCount-- ;

            minWhiteCount = Math.min(whiteCount , minWhiteCount ) ; 
            end++ ; start++ ;  
        }

        return minWhiteCount ; 
    }
}