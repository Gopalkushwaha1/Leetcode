class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int[] prefixSum = new int[nums.length + 1 ] ; 

        for ( int i = 0 ; i < requests.length ; i++ ) {
            int start = requests[i][0];
            int end = requests[i][1] + 1 ; 

            prefixSum[start]++;
            prefixSum[end]--;
        }
        for ( int i = 1 ; i < prefixSum.length ; i++ ) {
            prefixSum[i] += prefixSum[i-1] ; 
        }
        Arrays.sort(nums);
        Arrays.sort(prefixSum) ; 

        long sum = 0 ; 

        for ( int i = prefixSum.length - 1 ; i > 0 ; i-- ) {
            sum  = (sum + ((long)nums[i-1] * (long)prefixSum[i] ) % 1000000007 )% 1000000007; 
        }

        return (int)(sum % 1000000007 ) ; 
    }
}