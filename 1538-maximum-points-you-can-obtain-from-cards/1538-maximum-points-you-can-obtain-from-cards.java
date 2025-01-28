class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start = cardPoints.length - 1  , end = 0 , sum = 0 , maxSum = 0 ;

        while ( end < k ) {
            sum += cardPoints[end++] ; 
        }

        if ( end == cardPoints.length ) return sum ; 
        maxSum = sum ; 
        end--;
        while ( end >= 0 ) {
            
            sum -= cardPoints[end] ;
            sum += cardPoints[start] ; 

            maxSum = Math.max( sum , maxSum ) ;
            end-- ; start-- ; 
        }

        return maxSum ; 
    }
}