class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if ( s2.length() < s1.length()) return false ; 
       int[] ans1 = new int[26] ; 
       int[] ans2 = new int[26] ;
       int start = 0 ; 

       for ( int i = 0 ; i < s1.length() ; i++ ) {
        ans1[s1.charAt(i) - 'a']++;
       } 
       for ( int i = 0 ; i < s1.length() ; i++ ) {
        ans2[s2.charAt(i) - 'a']++;
       } 
       if(Arrays.equals(ans1 , ans2 )) return true ;

       for ( int i = s1.length() ; i < s2.length() ; i++ ) {
        ans2[s2.charAt(i) - 'a']++;
        ans2[s2.charAt(start) - 'a']--;
        start++ ; 

        if ( Arrays.equals(ans2 , ans1)) return true ;
       }
       return false ;
    }
    
}