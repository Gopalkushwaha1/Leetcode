class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] leftSum = new int[nums.length] ; 
        int[] rightSum = new int[nums.length] ; 
        int[] result = new int[nums.length - k + 1 ] ; 
        int max = Integer.MIN_VALUE ; 

        // filling leftSum 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if(i % k  == 0 ) {
                max = Integer.MIN_VALUE ; 
            }
            max = Math.max(max , nums[i]);
            leftSum[i] = max ; 
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