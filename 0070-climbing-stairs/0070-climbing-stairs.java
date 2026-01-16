class Solution {
    public int climbStairs(int n) {
        if( n <= 3 ) return n ; 
        int[] ans = new int[n+1] ; 
        ans[2] = 2 ; 
        ans[3] = 3 ; 

        for ( int i = 4 ; i < n+1 ; i++ ) {
            ans[i] = ans[i-1] + ans[i-2] ; 
        }

        return ans[n] ; 
    }
}