class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0 , start = 0 , end = 1 , result = 0  ;

        while ( end < 2 *  colors.length) {
            if(colors[end%colors.length] != colors[(end - 1) % colors.length ] ) {
                if(end - start + 1 >=  k ) {
                    if(end < colors.length) {  
                        count++;
                    }
                    result++;
                }
            }
            else {
                start = end ; 
            }
            end++ ;
        }  
        return result - count ;  

    }
}