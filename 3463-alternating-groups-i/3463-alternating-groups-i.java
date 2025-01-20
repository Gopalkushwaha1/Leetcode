class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0 ; // count variable for total count 
        int n = colors.length ; // len of arr

        // checking valid ans 
        for ( int i = 0 ; i < n ; i++ ) {
            if ( colors[i] != colors[(i+1)%n] && colors[(i+1)%n] != colors[(i+2)%n]) {
                count++ ; // if condition valid increase count by 1 ; 
            }
        }
        return count ; // return count 
    }
}