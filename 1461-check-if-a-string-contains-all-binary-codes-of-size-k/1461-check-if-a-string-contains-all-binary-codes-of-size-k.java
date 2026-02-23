class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length() ; 
        if(n-k+1 < ( 1 << k )) return false ; 

        // Take HashSet for store unique binary 
        HashSet<String> set = new HashSet<>() ; 
        int j = 0 ; 

        // travel k ...... n 
        
        for ( int i = k ; i <= n ; i++ ) {
            set.add(s.substring(j,i)) ; 
            j++ ; 

            // check set size == 2 ki power k 
            if(set.size() == (1 << k )) return true ; 
        }

        return false ; 
    }
}