class Solution {
    public int minOperations(String s) {
        // variable 
        //      -> n for len 
        //      -> char[] for s 
        //      -> ZeroStartCount 
        //      -> OneStartCount 


        int n = s.length() ; 
        char[] ch = s.toCharArray() ; 
        int zeroStartCount = 0  ; 
        int oneStartCount = 0  ; 

        for ( int i = 0 ; i < n ; i++ ) {

            if( i % 2 == 0 ) {

                // zeroStart  -> 0  but aagr 1 aaya to zeroCount 
                if(ch[i] == '1') {
                    zeroStartCount++ ; 
                }
                else {
                    oneStartCount++ ; 
                }
            }
            else {
                // if at odd 1 hai mtlb oneStartCount usko badado 

                if(ch[i] == '1') {
                    oneStartCount++ ; 
                }
                else {
                    zeroStartCount++ ; 
                }
            }
        }

        // min 
        return Math.min(zeroStartCount , oneStartCount ) ; 
    }
}