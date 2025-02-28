class Solution {
    public int minStartValue(int[] nums) {
        int min = Math.min(0,nums[0]);
        int sum = 0 ; 
        for ( int ele : nums ) {
            sum += ele ; 
            min = Math.min(min,sum) ; 
        }
        return min == 0 ? 1 : Math.abs(min)+1;
    }
}