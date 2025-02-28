class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0 ; 

        for ( int[] num : grid ) {
            for ( int ele : num ) {
                if( ele < 0 ) count++ ; 
            }
        }
        return count ; 
    }
}