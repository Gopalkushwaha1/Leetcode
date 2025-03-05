class Solution {
    public long coloredCells(int n) {
        if ( n == 1 ) return 1 ; 
        long a = 1L * n * n ;
        n = n - 1 ; 
        long b = 1L * n * n ; 

        return 1L * (a + b) ; 

    }
}