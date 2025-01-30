class Solution {
    public int countNegative(int[] nums ) {
        int start = 0 ,  end = nums.length - 1 ;
        while ( start <= end ) {
            int mid = (start + end ) / 2 ;
            if ( nums[mid] >= 0 ) {
                start = mid + 1 ; 
            } 
            else {
                end = mid - 1 ; 
            }
             
        }
        System.out.print(nums.length - start + " " ); 
        return nums.length - start ; 
    }
    public int countNegatives(int[][] grid) {
        int count = 0 ; 

        for ( int[] nums : grid ) {
            
            count += countNegative(nums) ; 
            
        }

        return count ; 
    }
}