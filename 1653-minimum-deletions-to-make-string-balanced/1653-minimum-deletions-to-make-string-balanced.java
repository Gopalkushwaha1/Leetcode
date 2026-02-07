class Solution {
    public int minimumDeletions(String s) {
        int n = s.length() ;
        int countA = 0 ;  
        int countB = 0 ;
        int ans = Integer.MAX_VALUE ; 

        for ( char ch : s.toCharArray() ) {
            if(ch == 'a')countA++ ; 
        }

        for ( char ch : s.toCharArray()) {
            if(ch == 'a') {
                ans = Math.min(countB+countA-1, ans ) ;
            }
            else {
                ans = Math.min(countB+countA , ans ) ;
            }
             
            if(ch == 'b' ) countB++ ; 
            else countA-- ; 
        }
        return ans ; 
    }
}