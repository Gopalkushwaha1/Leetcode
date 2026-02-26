class Solution {
    public int numSteps(String s) {
        // carry and step 

        int step = 0 ; 
        int carry = 0 ; 

        // travel from last 

        for ( int i = s.length() - 1 ; i > 0 ; i-- ) {

            // get curr bit 
            int bit = s.charAt(i) - '0' ; 

            // check curr bit + carry is odd 
            if(bit + carry == 1 ) {
                step += 2 ; 
                carry = 1 ; 
            }
            else {
                step += 1 ; 
            }
        }

        // return with carry + step 

        return carry + step ; 
    }
}