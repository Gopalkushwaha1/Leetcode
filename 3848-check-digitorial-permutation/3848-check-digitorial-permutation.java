class Solution {
    public boolean isSame(int sum , int n ) {
        // take freq arr 
        int[] sum1 = new int[10] ; 
        int[] n1 = new int[10] ; 

        // fill array 
        while ( sum > 0 ) {
            sum1[sum%10]++ ; 
            sum /= 10 ; 
        }

        while ( n > 0 ) {
            n1[n%10]++ ; 
            n /= 10 ; 
        }

        // check by travel each freq 

        for ( int i = 0 ; i < 10 ; i++ ) {
            if(sum1[i] != n1[i]) return false ; 
        }

        return true ; 
    }
    public boolean isDigitorialPermutation(int n) {
        // take fact array sum and dummy num 

        int num = n ; 
        int sum = 0 ; 
        int[] fact = new int[]{1,1,2,6,24,120,720,5040,40320,362880} ; 

        while ( num > 0 ) {
            int rem = num % 10 ; 
            sum += fact[rem] ; 
            num /= 10 ; 
        }

        // check equal 
        return isSame(sum , n ) ; 
    }
}