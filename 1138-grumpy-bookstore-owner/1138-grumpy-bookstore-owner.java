class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxCustomerSatisfied = 0  ;
        int localmaxCustomersSatisfied = 0 ;
        int max = 0 ; 
        int start = 0 ; 
        int end = 0 ; 

        // Calculating satisfied customers 
        for ( int i = 0 ; i < customers.length ; i++ ) {
            maxCustomerSatisfied += customers[i] * (1 - grumpy[i]) ; 
        } 
        
        // Making Sliding window 
        for ( end = 0 ; end < minutes ; end++ ) {
            localmaxCustomersSatisfied += customers[end] * grumpy[end] ; 
            max = Math.max( max , localmaxCustomersSatisfied) ;
        }

        // Travel this window to last ; 
        while ( end < customers.length ) {
            localmaxCustomersSatisfied += customers[end] * grumpy[end] ;
            localmaxCustomersSatisfied -= customers[start] * grumpy[start] ;
            end ++ ;
            start++ ; 
            max = Math.max( max , localmaxCustomersSatisfied) ; 
        }

        // return total satisfied customer 0 & 1 
        return maxCustomerSatisfied + max ; 
    }
}