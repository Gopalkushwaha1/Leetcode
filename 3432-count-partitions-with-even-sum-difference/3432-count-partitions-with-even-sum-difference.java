class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0 ; 

        for ( int ele : nums ) {
            sum += ele ; 
        }

        int count = 0 ; 
        int leftSum = 0 ; 

        for ( int i = 0 ; i < nums.length -1 ; i++  ) {
            int ele = nums[i] ; 
            leftSum += ele ; 
            if( ((sum - ele)-leftSum) % 2 == 0  ) count++ ; 
            sum -= ele ; 
        }
        return count ; 
    }
}