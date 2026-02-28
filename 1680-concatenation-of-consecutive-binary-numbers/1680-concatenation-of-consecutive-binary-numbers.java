class Solution {
    static int ans = 0 ;
    static int mod = 1_000_000_007 ;

    public void changeBinaryToDecimal(String str ) {
        // simple travel str bit 
        // apply formula left side ans and add curr i bit 

        for ( int i = 0 ; i < str.length() ; i++ ) {
            // find curr bit 
            int bit = str.charAt(i) - '0'; 

            ans = ((ans * 2 ) + bit ) % mod  ; 
        }
    }
    public int concatenatedBinary(int n) {
        // take long ans to store ans 

        ans = 0 ; 
        mod = 1_000_000_007 ; 

        // travel i = 1 ......... n 

        for ( int i = 1 ; i <= n ; i++ ) {

            // find curr num binary 

            String binary = Integer.toBinaryString(i) ; 
            // change binary to decimal add in ans ; 

            changeBinaryToDecimal(binary) ; 

        }

        return (int) (ans%mod) ; 
    }
}