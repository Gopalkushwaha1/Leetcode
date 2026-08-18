class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int[] count = new int[51] ; 

        for ( int ele : nums ) {
            count[ele]++ ; 
        }


        // for k == nums.length 
        if( k == nums.length ) {
            int max = -1 ; 
            for ( int ele : nums ) {
                max = Math.max(ele , max) ; 
            }
            return max ; 
        }

        // k == 1 
        if ( k == 1 ) {
            for ( int i = 50 ; i >= 0 ; i-- ) {
            if(count[i] == 1 ) return i ; 
        }
        }

        int ans = -1 ; 
        if( count[nums[0]] == 1 ) {
            ans = Math.max(ans , nums[0]) ; 
        }
        if ( count[nums[nums.length-1]] == 1 ) {
            ans = Math.max(ans , nums[nums.length-1]) ; 
        }

        return ans ; 
    }
}