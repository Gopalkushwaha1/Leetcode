class Solution {
    public int minFlips(String s) {
        int n = s.length() ; 
        char[] onePattern = new char[2*n] ; 
        char[] zeroPattern = new char[2*n] ;

        StringBuilder sb = new StringBuilder(s+s) ; 
        int zeroCount = 0 ; 
        int oneCount = 0 ; 
        int ans = Integer.MAX_VALUE ; 

        // fill the pattern 

        for ( int i = 0 ; i < 2*n ; i++ ) {
            if(i % 2 == 0 ) {
                zeroPattern[i] = '0' ; 
                onePattern[i] = '1' ; 
            }
            else {
                zeroPattern[i] = '1' ; 
                onePattern[i] = '0' ; 
            }
        } 
        int i = 0 ; 
        int j = 0 ; 

        while ( i < n ) {
            char ch = sb.charAt(i) ; 

            if(ch != zeroPattern[i]){
                zeroCount++ ; 
            } 
            else {
                oneCount++ ; 
            }
            i++ ; 
        }

        // update the ans 
        ans = Math.min(oneCount , zeroCount ) ; 

        // start the window 

        while ( i < 2*n ) {
            char currChar = sb.charAt(i) ; 
            char prevChar = sb.charAt(j) ;

            // count increase when curr miss match 
            if(currChar != zeroPattern[i]) {
                zeroCount++ ; 
            } 
            else {
                oneCount++ ; 
            }

            // count decrese when prev miss match 

            if(prevChar != zeroPattern[j]) {
                zeroCount-- ; 
            }
            else {
                oneCount-- ; 
            }

            // update the ans 
            ans = Math.min(ans , Math.min(oneCount , zeroCount )) ;

            i++ ; j++ ; // update the window  
        }
        return ans ; 
    }
}