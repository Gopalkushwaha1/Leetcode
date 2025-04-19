class Solution {
    public long minimumReplacement(int[] nums) {
        long operation = 0 ; 

        for ( int i = nums.length - 2 ; i >= 0 ; i-- ) {
            if( nums[i] < nums[i+1]) {
                continue ;  
            }
            int count = nums[i]/nums[i+1] ; 

                if(nums[i] % nums[i+1] != 0 ) {
                    count++;
                }
                operation += count -1 ; 
                nums[i] = (nums[i]/count) ;
        } 
        return operation ; 
    }
}