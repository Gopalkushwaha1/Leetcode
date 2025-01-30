class Solution {
    public int findMin(int[] nums) {
       int start = 0 , end = nums.length - 1 ; 

       while ( start <= end ) {
        int mid = (start + end ) / 2 ; 
        if ( nums[mid] > nums[nums.length - 1]) {
            start = mid + 1 ;
        }
        else {
            end = mid - 1 ; 
        }
       } 
       return nums[start] ; 
    }
}