class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0 ; 

        for ( int[] num : grid ) {
           int start = 0 , end = num.length - 1 ; 
           if ( num[end] >= 0 ) continue ; 
           while ( start <= end ) {
            int mid = (start + end ) / 2 ; 
            if ( num[mid] >= 0 ) {
                start = mid + 1 ; 
            }
            else {
                end = mid - 1 ; 
            }
           }
             
           count += (num.length - start ) ; 
           System.out.print(count + " ") ;
        }
        return count ; 
    }
}