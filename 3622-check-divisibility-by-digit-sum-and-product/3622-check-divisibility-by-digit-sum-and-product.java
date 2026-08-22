class Solution {
    public boolean checkDivisibility(int n) {
        // Take Varibale to store sum and product 
        int sum = 0 ; 
        int prod = 1 ; 
        int totalSum = 0 ; 
        int originalN = n ; 

        // Calculate sum and prod 
        while ( n > 0 ) {
            int rem = n % 10 ; 
            n /= 10 ; 
            sum += rem ; // update the sum ( sum = sum + rem ) 
            prod *= rem ; // update the prod ( prod = prod * rem )
        }

        totalSum = sum + prod ; 

        // check the condition 
        if( originalN % totalSum == 0 ) return true ; 

        return false ; 
    }
}