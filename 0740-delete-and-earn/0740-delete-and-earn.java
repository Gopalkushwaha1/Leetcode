class Solution {
    public int find(int n , HashMap<Integer , Integer> map , int[] dp ) {
        if ( n == 0 ) return 0 ; 

        if ( n == 1 ) return map.getOrDefault(1,0) ; 

        if(dp[n] != -1 ) return dp[n] ; 

        return dp[n] =  Math.max( map.getOrDefault(n,0) + find(n-2, map , dp ) , find( n-1 , map, dp  )) ; 
    }
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int max = nums[0] ; 

        for ( int ele : nums ) {
            max = Math.max(max , ele) ; 
            map.put(ele , map.getOrDefault(ele,0)+ele) ; 
        }
        int[] dp = new int[max+1] ; 
        Arrays.fill(dp , -1) ; 
        return find(max , map , dp ) ; 
    }
}