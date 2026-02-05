class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length  ; 
        int[] res = new int[n] ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            res[i] = nums[(((i + nums[i]) % n) + n) % n];
        }

        return res ; 
    }
}