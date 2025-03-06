class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>() ; 

        for ( int i = 0 ; i < nums1.length ; i++ ) {
            for ( int j = 0 ; j < nums1.length ; j++ ) {
                int sum = nums1[i] + nums2[j] ; 
                if ( map.containsKey(sum)){
                    int freq = map.get(sum) ; 
                    map.put(sum , freq+1) ;
                } 
                else {
                    map.put(sum , 1 ) ; 
                }
            }
        }
        int ans = 0 ; 
        for ( int i = 0 ; i < nums3.length ; i++ ) {
            for ( int j = 0 ; j < nums1.length ; j++ ) {
                int req = -1 * (nums3[i] + nums4[j]) ; 
                if(map.containsKey(req)) {
                    ans += map.get(req) ; 
                }
            }
        }
        return ans ; 
    }
}