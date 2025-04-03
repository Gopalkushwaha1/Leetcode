class Solution {
    public void swap(int[] nums , int i , int j ) {
        int temp = nums[i] ; 
        nums[i] = nums[j] ; 
        nums[j] = temp ; 
    }
    public void moveZeroes(int[] nums) {
        int i = 0 , j = 0 ; 

        while( i < nums.length && nums[i] != 0 ) {
            i++;
        }
        j = i ; 
        while( j < nums.length && nums[j] == 0 ){
            j++;
        }

        while ( j < nums.length ) {
            swap(nums , i , j ) ; 
            i++;
            while( j < nums.length && nums[j] == 0 ) {
                j++;
            }
        }
    }
}