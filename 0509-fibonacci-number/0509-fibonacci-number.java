class Solution {
    public int ans(int n ) {
        if ( n == 0 ) {
            return 0 ; 
        }
        if ( n <= 2 ) {
            return 1 ; 
        }
        return ans(n-1) + ans(n-2) ; 
    }
    public int fib(int n) {
        return ans(n) ; 
    }
}