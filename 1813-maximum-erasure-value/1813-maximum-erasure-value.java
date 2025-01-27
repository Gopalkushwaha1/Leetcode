class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int max = 0 ; 

      for ( int ele : nums) {
        max = Math.max ( ele , max ) ; 
      }  
      int[] freq = new int[max+1] ;

    //   for ( int i = 0 ; i < nums.length ; i++ ) {
    //     int idx = nums[i] ; 
    //     freq[idx]++;
    //   }

      int start = 0 , end = 0 , sum = 0 , maxSum = 0 ; 

      while ( end < nums.length ) {
        int ele = nums[end] ; 
        freq[ele]++ ; 

        while ( freq[ele] != 1 ) {
            int idx = nums[start] ; 
            freq[idx]--;
            sum -= idx ;
            start++ ;  
        }

        if ( freq[ele] == 1 ) {
            sum += ele ; 
            maxSum = Math.max ( sum , maxSum ) ; 
            end++ ; 
        }

      }
      return maxSum ; 
    }
}