class Solution {
    public int largestAltitude(int[] gain) {
        int ans = Math.max(0,gain[0]) ; 
        for ( int i = 1 ; i < gain.length ; i++ ) {
            gain[i] += gain[i-1] ; 
            ans = Math.max(ans,gain[i]) ; 
        }
        return ans ; 
    }
}