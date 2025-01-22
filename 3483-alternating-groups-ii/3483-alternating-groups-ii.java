class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0 , start = 0 , end = 1 , result = 0  ;

        while ( end < 2 *  colors.length) {
            if(colors[end%colors.length] != colors[(end - 1) % colors.length ] ) {
                if(end - start + 1 >=  k ) {
                    count++; 
                }
            }
            else {
                start = end ; 
            }
            end++ ;
        } 
        start = 0 ;
        end = 1 ; 

        while ( end < colors.length) {
            if(colors[end] != colors[end - 1 ] ) {
                if(end - start + 1 >=  k ) {
                    result++; 
                }
            }
            else {
                start = end ; 
            }
            end++ ;
        } 
        return count - result ;  

    }
}