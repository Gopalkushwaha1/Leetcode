class Solution {
    public boolean isPrime(int totalBit) {
        if ( totalBit < 2 ) return false ; 

        for ( int i = 2 ; i * i <= totalBit ; i++ ) {
            if(totalBit % i == 0 ) return false ; 
        }

        return true ; 
        
    }
    public int countPrimeSetBits(int left, int right) {
        // count 

        int count = 0 ; 

        for ( int i = left ; i <= right ; i++ ) {
            // Convert into binary String 

            int bit = Integer.bitCount(i) ; // give total 1 bit 

            // check if prime 
            if(isPrime(bit)) {
                count++ ; 
            } 
        }

        return count ; 
    }
}