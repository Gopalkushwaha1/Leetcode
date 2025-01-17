class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length ; 
        int start = 0 ; 
        int end = 0 ; 
        int max = 0 ;
        
        for ( end = 0 ; end< k ; end++) {
            max += cardPoints[end] ; 
        }
        int localMax = max ;


        int last = cardPoints.length - 1 ;
        end--;
        while ( end >= 0 ) {
            localMax += cardPoints[last];
            localMax -= cardPoints[end] ; 
            max = Math.max ( max , localMax ) ;
            end--;
            last--;
        }
        return max ; 
    }
}