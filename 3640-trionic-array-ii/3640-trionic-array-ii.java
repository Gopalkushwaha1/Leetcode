class Solution {
    public long maxSumTrionic(int[] nums) {
        int ansMax = Integer.MIN_VALUE ; 
        int localMax = 0 ; 
        int localSum = 0 ; 
        int idx = 1 ; 

        while ( idx < nums.length && nums[idx] < nums[idx-1]) idx++ ; 
        localMax = nums[idx-1] ; 
        while (idx < nums.length && nums[idx] > nums[idx-1]) {
            localMax += nums[idx] ; 
            idx++ ; 
        }
        while ( idx < nums.length && nums[idx] < nums[idx-1] ) {
            localMax += nums[idx] ; 
            idx++ ; 
        } 

        while ( idx < nums.length && nums[idx] > nums[idx-1] ) {
            localSum += nums[idx] ; 
            localMax += nums[idx] ;  
            ansMax = Math.max(ansMax , localMax ) ; 
            idx++ ; 
        }
        localMax = localSum ; 
        if(idx == nums.length ) return ansMax ; 

        while ( idx < nums.length ) {
            while( idx < nums.length && nums[idx] < nums[idx-1] ) {
                localMax += nums[idx] ; 
                idx++ ; 
            }
            if(idx >= nums.length - 2 ) return ansMax ;
            int sum = 0 ; 
            while ( idx < nums.length && nums[idx] > nums[idx-1]) {
                sum += nums[idx] ; 
                localMax += sum ; 
                ansMax = Math.max(ansMax , localMax) ; 
                idx++ ; 
            } 
            localMax = sum ; 
        }

        return ansMax ; 
    }
}