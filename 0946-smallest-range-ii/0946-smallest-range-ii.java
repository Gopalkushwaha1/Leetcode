class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length , i = 0 , min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ; 
        Arrays.sort(nums) ; 
        int minL = nums[0] + k ;
        int maxR = nums[n-1] - k  ;
        int result = nums[n-1] - nums[0] ; 

        while ( i <= n-2 ) {
            min = Math.min ( minL , nums[i+1] - k ) ;
            max = Math.max ( maxR , nums[i] + k ) ;

            result = Math.min ( max - min , result ) ; 
            i++ ; 
        }
        return result ; 
    }
}