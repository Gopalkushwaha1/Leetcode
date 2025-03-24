class Solution {
    public int countDays(int days, int[][] meetings) {
        int last = 0 , count = 0 ;

        Arrays.sort(meetings , Comparator.comparingInt(a -> a[0])) ;

        for ( int[] arr : meetings ) {
            int start = arr[0] , end = arr[1] ; 

            if ( start > last + 1 ) {
                count += start - last - 1 ; 
            }

            last = Math.max(last , end ) ; 
        }

        count += days - last ; 
        return count ; 
    }
}