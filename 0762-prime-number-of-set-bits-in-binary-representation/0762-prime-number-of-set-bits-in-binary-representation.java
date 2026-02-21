class Solution {
    public boolean isPrime(String str ) {
        int count = 0 ; 

        // count total 1 in binary 
        for ( char ch : str.toCharArray()) {
            if(ch == '1') count++ ; 
        }

        // count < 2 not prime 

        if(count < 2 ) return false ; 

        // check prime 

        for ( int i = 2 ; i < count ; i++ ) {
            if(count % i == 0 ) return false ; 
        }

        return true ; 
        
    }
    public int countPrimeSetBits(int left, int right) {
        // count 

        int count = 0 ; 

        for ( int i = left ; i <= right ; i++ ) {
            // Convert into binary String 

            String str = Integer.toBinaryString(i) ; 

            // check if prime 
            if(isPrime(str)) {
                count++ ; 
            } 
        }

        return count ; 
    }
}