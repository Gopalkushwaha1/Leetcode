class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0 , j = 0 ; 
        int[] ans = new int[nums.length] ; 


        for ( int i = 0 ; i < nums.length ; i++ ) {
            if( nums[i] == pivot) {
                count++;
                continue ; 
            }
            if ( nums[i] < pivot ) {
                ans[j++] = nums[i] ; 
            }
        }
        while ( count != 0 ) {
            ans[j++] = pivot ; 
            count--;
        }
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] > pivot ) {
                ans[j++] = nums[i] ; 
            }
        }
        return ans ; 
    }
}