class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens) ; 
        int i = 0 , j = tokens.length - 1 , count = 0 , maxCount = 0 ;

        while ( i < j ) {

            if ( tokens[i] <= power ) {
                power = power - tokens[i] ; 
                i++ ; 
                count++ ;  
            }
            else if ( count >= 1 ) {
                power = power + tokens[j] ; 
                j-- ;
                count-- ; 
            }
            else break ; 
        }
        if ( i == j ) {
            if(tokens[i] <= power) count++ ;  
        }
        return count  ; 
    }
}