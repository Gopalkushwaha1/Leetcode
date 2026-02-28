class Solution {
    public int concatenatedBinary(int n) {
        long ans = 0 ; 
        int mod = 1_000_000_007 ; 

        // treval i 1 ....n
        for ( int i = 1 ; i <= n ; i++ ) {

            // find curr length binary 
            int len = Integer.toBinaryString(i).length() ; 

            ans = ( (ans << len ) + i ) % mod ; 
        }

        return (int)ans ;  
    }
}