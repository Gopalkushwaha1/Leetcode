class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int satisfiedCust = 0 , start = 0 , end = 0 , unsatisfiedCust = 0  , maxUnsatisfiedCust = 0 ; 
        //count staisfied customer 
        for ( int i = 0 ; i < grumpy.length ; i++ ) {  // TC :-> O(n)
            satisfiedCust += customer[i] * (1 - grumpy[i]) ; 
        }

        // Calculating unsatisfied customer 
        for ( end = 0 ;  end < minutes ; end++ ) {   // TC :-> O(minutes)
            unsatisfiedCust += customer[end] * grumpy[end] ; 
        }
        maxUnsatisfiedCust = Math.max( maxUnsatisfiedCust , unsatisfiedCust) ; // update maxUnsatisfiedCust

        while ( end < grumpy.length ) {  // TC -> 0(n)          // sliding window for mintues
            unsatisfiedCust += customer[end] * grumpy[end] ;       // increase the window by 1 
            unsatisfiedCust -= customer[start] * grumpy[start] ;   // slink the window by 1 
            maxUnsatisfiedCust = Math.max( maxUnsatisfiedCust , unsatisfiedCust) ;   // update ans 
            end++; start++ ;        // update window 

        }
        return maxUnsatisfiedCust + satisfiedCust ; // return ans 
    }
}