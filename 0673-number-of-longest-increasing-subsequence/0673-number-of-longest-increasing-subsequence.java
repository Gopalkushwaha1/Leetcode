class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] maxLen = new int[nums.length] ; 
        int[] count = new int[nums.length] ; 

        int ans = 0 ; 
        Arrays.fill(maxLen , 1) ; 
        Arrays.fill(count , 1 ) ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = 0 ; j < i ; j++ ) {
                if ( nums[i] > nums[j] && maxLen[j] + 1 > maxLen[i]) {
                    maxLen[i] = maxLen[j] + 1 ;
                    count[i] = 0 ; 
                }
                if ( maxLen[i] == 1 + maxLen[j]) {
                    count[i] += count[j] ; 
                }

            }
        }

        int len = 0 ; 
        for ( int ele : maxLen ) {
            if ( ele > len ) {
                len = ele ; 
            }
        }

        for ( int i = 0 ; i < nums.length ; i++ ) { 
            if(maxLen[i] == len ) {
                ans += count[i] ; 
            }
        }

        return ans ; 
    }
}