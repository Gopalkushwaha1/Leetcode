class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length() ; 
        boolean[] seen = new boolean[1<<k] ; 
        int count = 0 ; 
        if(n-k+1 < (1<<k)) return false ; 

        int num = 0 ; 
        for ( int i = 0 ; i < k ; i++ ) {
            int bit = s.charAt(i) - '0' ; 
            num = (num<<1) | bit ; 
        }
        seen[num] = true ; 
        count++ ; 


        for ( int i = k ; i < n ; i++ ) {
            int bit = s.charAt(i) - '0' ; 
            num = ((num << 1 ) | bit ) % ((1 << k) ) ; 

            if(!seen[num]){
                seen[num] = true ; 
                count++ ; 
            }

            if(count == (1 << k )) return true ; 

        }

        return false ; 
    }
}