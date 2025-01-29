class Solution {
    public int hIndex(int[] c) {
        int[] ans = new int[c.length + 1 ] ;

        // Filling freq of each ele 
        for  (int i = 0 ; i < c.length ; i++ ) {
            if (c[i] >= c.length) {
                ans[ans.length - 1 ]++;
            }
            else {
                ans[c[i]]++;
            }
        }

        // Sufix Sum
        for ( int i = ans.length - 2 ; i >= 0 ; i-- ) {
            ans[i] += ans[i+1] ;
        }

        // Find the H Index 
        for ( int i = ans.length - 1 ; i >= 0 ; i-- ) {
            if (ans[i] >= i ) {
                return i ; 
            }
        } 
        return 0 ; 
    }
}