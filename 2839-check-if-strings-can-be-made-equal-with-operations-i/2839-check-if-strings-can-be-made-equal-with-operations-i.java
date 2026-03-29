class Solution {
    public boolean canBeEqual(String s1, String s2) {
        /// take array 
        int n = s1.length() ; 
        int[] odd1 = new int[26] ; 
        int[] odd2 = new int[26] ; 
        int[] even1 = new int[26] ; 
        int[] even2 = new int[26] ; 

        // edge case 
        if(s1.length() != s2.length()) return false ; 

        // odd travel 
        for ( int i = 1 ; i < n ; i+=2 ) {
            odd1[s1.charAt(i) - 'a']++ ; 
            odd2[s2.charAt(i) - 'a']++ ;  
        }

        // check for valid 
        for ( int i = 0 ; i < 26 ; i++ ) {
            if(odd1[i] != odd2[i]) return false ; 
        }

        // even travel 
        for ( int i = 0 ; i < n ; i+=2) {
            even1[s1.charAt(i) - 'a']++ ; 
            even2[s2.charAt(i) - 'a']++ ;  
        }

        // check 
        for ( int i = 0 ; i < 26 ; i++ ) {
            if(even1[i] != even2[i]) return false ; 
        }

        return true ; 
    }
}