class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0 , end  = 1 , oneCycleCount = 0 , twoCycleCount = 0 , n = colors.length; 

        while ( end < 2* n ) {
            if(colors[end % n ] != colors[(end - 1 ) % n ]){
                if(end - start + 1 >= k ) {
                    if(end < n ) {
                        oneCycleCount++ ; 
                    }
                    twoCycleCount++ ; 
                }
            }
            else {
                start = end ; 
            }
            end++ ; 
        }
        return twoCycleCount - oneCycleCount ; 
    }
}