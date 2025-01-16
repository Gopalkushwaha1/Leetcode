class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length ; 
        int count = 0 ;

        for ( int i = 0 ; i < n ; i++ ) {
            int next = ( i + 1 ) % n ;
            int nextNext = ( i + 2 ) % n ;

            if ( colors[i] != colors[next] && colors[next] != colors[nextNext]) count++ ; 
        }
        return count ; 
    }
}