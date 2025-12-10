class Solution {
    final static int mod = 1_000_000_007 ; 
    public long fact(int n ) {
        if ( n <= 2 ) return n ; 

        return (n * fact(n-1))%mod ; 
    }
    public int countPermutations(int[] complexity) {
        int min =  complexity[0] ; 
        for ( int i = 1 ; i < complexity.length ; i++  ) {
            if ( complexity[i] <= min ) return 0 ; 
        }

        long ans =  fact(complexity.length-1) ;

        return (int)(ans % mod ) ;  
    }
}