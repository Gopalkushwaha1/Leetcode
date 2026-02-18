class Solution {
    public boolean hasAlternatingBits(int n) {
        // Change to binary and store it 

        String binary = Integer.toBinaryString(n) ; 

        // Travel to binary String check alternate if equal then false 

        for ( int i = 1 ; i < binary.length() ; i++ ) {
            if(binary.charAt(i) == binary.charAt(i-1)) return false ; 
        }

        return true ; 
    }
}