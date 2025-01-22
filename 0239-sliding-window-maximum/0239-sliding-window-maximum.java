class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] leftSum = new int[nums.length] ; 
        int[] rightSum = new int[nums.length] ; 
        int[] result = new int[nums.length - k + 1 ] ; 

        // filling leftSum 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if(i % k  == 0 ) {
                leftSum[i] = nums[i] ; 
            }
            else {
                leftSum[i] = Math.max(leftSum[i-1] , nums[i]);
            }
        }
       // filling RightSum
       for ( int i = nums.length - 1 ; i >= 0 ; i-- ) {
        if ( i == nums.length -1 || (i + 1 ) % k == 0 ) {
            rightSum[i] = nums[i] ; 
        }
        else {
            rightSum[i] = Math.max(nums[i] , rightSum[i+1]);
        }
       }

       // filling Result 
       for ( int i = 0 ; i < result.length ; i++ ) {
        result[i] = Math.max(rightSum[i] , leftSum[i+k - 1]);
       } 

       return result ; // return ans 
    }
}