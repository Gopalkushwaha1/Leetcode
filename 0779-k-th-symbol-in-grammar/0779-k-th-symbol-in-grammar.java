class Solution {
    public int kthGrammar(int n, int k) {
        if( n == 1 && k == 1 ) return 0 ; 
        int len = (int)Math.pow(2,n-1) ;  // len = 1
        len /= 2 ; 

        if ( k <= len ) {
           return  kthGrammar(n-1,k) ; // 0 
        } 
        else  {
            return 1 -  kthGrammar(n-1,k-len) ; 
        }
    }
}

// n = 1    0 
// n = 2    01
// n = 3    0110
// n = 4    01101001
// n = 5    0110100110010110   // k  = 9 
// n = 6    01101001100101101001011001101001

// k = 9 , n = 5 
// len = 8 
// 

