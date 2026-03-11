class Solution {
    public int bitwiseComplement(int n) {
        // convert into binary 
        // flip the bit 
        // convert int decimal 

        String binary = Integer.toBinaryString(n) ; 
        StringBuilder sb = new StringBuilder(binary) ; 

        // convert bit 
        for ( int i = 0 ; i < sb.length() ; i++ ) {
            if(sb.charAt(i) == '0') {
                sb.setCharAt(i,'1') ; 
            }
            else {
                sb.setCharAt(i,'0') ; 
            }
        }

        // convert to decimal 
        int dec = Integer.parseInt(sb.toString() , 2 ) ; 

        return dec ; 
    }
}