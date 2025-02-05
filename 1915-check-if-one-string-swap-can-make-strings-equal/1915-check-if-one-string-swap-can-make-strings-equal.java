class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       // Check At which indices char is Diff
       int idx = 0 ; 
       for ( idx = 0 ; idx < s1.length() ; idx++ ) {
        if ( s1.charAt(idx) != s2.charAt(idx)) break ; 
       } 
       // Indices reach at Last index it means it is sorted no swap need 
       if ( idx == s1.length()) return true ; 
       char ch = s2.charAt(idx) ; 
       int swapidx = 0 ; 
       for ( swapidx = idx + 1 ; swapidx < s1.length() ; swapidx++ ) {
        if (s1.charAt(swapidx) == ch && s1.charAt(idx) == s2.charAt(swapidx) ) break ; 
       }
       if ( swapidx == s1.length()) return false ; 
       char[] c = s1.toCharArray() ; 
       char temp = c[idx] ;
       c[idx] = c[swapidx] ; 
       c[swapidx] = temp ; 

       String s = new String(c) ;
       System.out.println("New String " + s ) ;  
       for ( int i = 0 ; i < s1.length() ; i++ ) {

        if( s.charAt(i) != s2.charAt(i)) {
            System.out.print("Not equal At : " + i ) ; 
            return false ; 
        }
       } 
       return true ; 
    }
}