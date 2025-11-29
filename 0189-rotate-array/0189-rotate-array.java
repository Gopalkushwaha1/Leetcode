class Solution {
    public void revrse(int[] nums , int s , int e ) {
        while ( s <= e) {
            int temp = nums[s] ; 
            nums[s] = nums[e] ; 
            nums[e] = temp ;
            s++ ; 
            e-- ; 
        } 
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length ; 
        int mid = nums.length - k ; 

        revrse(nums , 0 , mid-1 ) ; 
        revrse(nums , mid , nums.length-1 ) ; 
        revrse(nums , 0 , nums.length-1) ; 

    }
}