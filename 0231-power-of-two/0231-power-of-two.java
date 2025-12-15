class Solution {
    public boolean isPowerOfTwo(int n) {
        while ( n != 1 ) {
            if ( n % 2 != 0 ) return false ; 
            n /= 2 ; 
        }
        return true ; 
    }
}