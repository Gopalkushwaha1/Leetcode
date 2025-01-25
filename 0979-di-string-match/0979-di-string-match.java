class Solution {
    public int[] diStringMatch(String s) {
        //define prerequisite varibale 
        int d = s.length() , i = 0 , idx = 0 ;
        int[] ans = new int[s.length() + 1 ] ;

        while ( d != i ) {

            if ( s.charAt(idx) == 'I' ) {
                ans[idx] = i ;
                i++ ; 
            }
            else {
                ans[idx] = d ; 
                d-- ; 
            }
            idx++ ; 
        }

        ans[s.length()] = d ;

        return ans ; 
    }
}