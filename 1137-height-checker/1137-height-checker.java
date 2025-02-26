class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101] ; 
        // Fill the freq array
        for ( int ele : heights ) {
            freq[ele]++;
        }

        int hi = 0 , count = 0 ; 

        for ( int i = 0 ; i < 101 ; i++ ) {
            for ( int j = 0 ; j < freq[i] ; j++ ) {
                if ( heights[hi++] != i) count++;
            }
        }
        return count ; 
    }
}