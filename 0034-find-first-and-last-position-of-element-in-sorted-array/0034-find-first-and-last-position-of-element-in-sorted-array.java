class Solution {
    public int findLeftIdx ( int[] nums , int target) {
        int start = 0 , end = nums.length - 1 ; 

        while ( start <= end ) {
            int mid = ( start + end )  / 2 ;
            if ( nums[mid] >= target) {
                end = mid - 1 ; 
            } 
            else {
                start = mid + 1 ; 
            }
        }
        return start ; 
    }
    public int findRightIdx ( int[] nums , int target) {
        int start = 0 , end = nums.length - 1 ; 

        while ( start <= end ) {
            int mid = ( start + end )  / 2 ;
            if ( nums[mid] > target) {
                end = mid - 1 ; 
            } 
            else {
                start = mid + 1 ; 
            }
        }
        return end ; 
    }
    public int[] searchRange(int[] nums, int target) {
       int[] ans = new int[]{-1,-1} ; 

       int left = findLeftIdx(nums,target) ; 
       int right = findRightIdx(nums,target) ; 

       if ( left < 0 || right < 0 || left > right ) {
        return ans ; 
       }
       ans[0] = left ;
       ans[1] = right ; 

       return ans ; 
    }
}