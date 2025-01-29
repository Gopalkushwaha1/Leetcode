class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length + k - 1 , j = 0 , count = 0  ; 

        for  ( int i = 1 ; i < n ; i++ ) {

            if ( colors[i%colors.length] != colors[(i-1)%colors.length]) {
                if(i - j + 1 >= k ) {
                    count++ ; 
                }
            }
            else {
                j = i ; 
            }
        }

        return count ; 
    }
}