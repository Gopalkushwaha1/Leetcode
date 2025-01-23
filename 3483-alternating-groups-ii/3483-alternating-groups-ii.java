class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int maxLen = 1 , ans = 0 , n = colors.length ;

        for ( int i = 1 ; i <= n + k - 2 ; i++ ) {

            if( colors[i % n ] != colors[ (i - 1 ) % n ]) maxLen++ ;

            else maxLen = 1 ;

            if( maxLen >= k ) ans++ ; 

        }
        return ans ; 
    }
}