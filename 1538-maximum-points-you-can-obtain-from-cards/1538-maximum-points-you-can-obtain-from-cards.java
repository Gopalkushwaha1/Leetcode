class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length ; 
        int start = 0 ; 
        int end = 0 ; 
        int maxCardValue = 0 ;   // Variable to track max Card value for k card 
        
        // Making Window of length k
        for ( end = 0 ; end< k ; end++) {
            maxCardValue += cardPoints[end] ; 
        }
        int localMax = maxCardValue ;    // Variable to track local max Card value for k card 


        int last = cardPoints.length - 1 ;  // to track from last 
        end--;
        // Apply silding window to travel each window
        while ( end >= 0 ) {
            localMax += cardPoints[last];
            localMax -= cardPoints[end] ; 
            maxCardValue = Math.max ( maxCardValue , localMax ) ; // if max found update max 
            end--;
            last--;
        }
        return maxCardValue ; // return maximum card value
    }
}