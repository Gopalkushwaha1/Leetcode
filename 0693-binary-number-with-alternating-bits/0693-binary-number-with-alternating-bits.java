class Solution {
    public boolean hasAlternatingBits(int n) {
        if( n== 1 ) return true ; 
        int prev = n % 2 ; 
        int rem = -1 ; 
        n /= 2 ; 

        while ( n != 1 ) {
            // find curr bit 
            rem = n % 2 ; 
            // compare check 
            if(rem == prev ) return false ; 
            // update prev 
            prev = rem ; 

            n /= 2 ; 
        }

        if(prev == n ) return false ; 

        return true ; 
    }
}