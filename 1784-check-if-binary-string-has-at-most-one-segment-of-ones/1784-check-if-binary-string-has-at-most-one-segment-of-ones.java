class Solution {
    public boolean checkOnesSegment(String s) {
        // check one kb break hoga 

        int i = 0 ; 

        while ( i < s.length() ) {
            if(s.charAt(i) == '0') break ; 
            i++ ; 
        }

        // check again 1 came then false not :: More than 1 continuous one 
        for ( int j = i ; j < s.length() ; j++ ) {
            if(s.charAt(j) == '1') return false ; 
        }

        // return true ; 
        return true ; 
    }
}