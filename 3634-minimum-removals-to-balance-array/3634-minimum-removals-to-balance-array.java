class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums) ; 
        int i = 0 ; 
        int j = 0 ; 
        int count = Integer.MAX_VALUE ; 

        while ( j < nums.length && i <= j ) {
            while ( j < nums.length && (long)nums[i]*k >= nums[j])j++ ; 
            count = Math.min(count , i + (nums.length - j ) ) ; 
            i++ ; 
        }
        return count ; 
    }
}