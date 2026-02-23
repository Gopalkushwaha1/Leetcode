class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length() ; 
        if(n-k+1 < (1 << k ) ) return false ; 

        HashSet<String> set = new HashSet<>() ; 
        int j = 0 ; 
        
        for ( int i = k ; i <= n ; i++ ) {
            set.add(s.substring(j , i )) ; 
            j++ ;  
            if(set.size() == (1 << k ) ) return true ; 
        }

        return false ; 
    }
}