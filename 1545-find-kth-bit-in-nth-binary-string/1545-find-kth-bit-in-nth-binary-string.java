class Solution {
    public char findKthBit(int n, int k) {
        // Take StringBuilder for ans 

        StringBuilder sb = new StringBuilder("0") ;    // s1 -> 0 

        n-- ; 

        while ( n > 0 ) {
            // create new sb 
            // store prev sb and append 1 then append rev(invert(prev sb)) 

            StringBuilder sb2 = new StringBuilder(sb) ; 
            sb2.append("1") ; 

            // for reverse we travel right to left 
            // for invert 
            //     -> if 0 then add 1 
            //     -> if 1 then add 0 

            for ( int i = sb.length() - 1 ; i >= 0 ; i-- ) {
                char ch = sb.charAt(i) ; 

                // invert 
                if(ch == '0') {
                    sb2.append("1") ; 
                }
                else {
                    sb2.append("0") ; 
                }
            }

            sb = sb2 ; 
            n-- ; 
        }

        // return kth idx but 1 based idx k-1 

        return sb.charAt(k-1) ; 
    }
}