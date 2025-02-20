class Solution {
    public int fib(int n) {
        if ( n <= 1 ) return n ; 
        int curr = 1 ; 
        int prev = 0 ; 
        int ans = 0 ; 
        for ( int i = 2 ;  i <= n ; i++ ) {
            ans = curr + prev ; 
            prev = curr ; 
            curr = ans ; 
        } 
        return ans ; 
    }
}