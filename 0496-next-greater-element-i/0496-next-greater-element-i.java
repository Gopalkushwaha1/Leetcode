class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 

        for ( int i = 0 ; i < nums2.length ; i++ ) {
            map.put(nums2[i] , i ) ; 
        }

        int[] ans = new int[nums1.length] ; 

        for ( int i = 0 ; i < nums1.length ; i++ ) {
            int start = map.get(nums1[i]) ; 
            ans[i] = -1 ; 
            for ( int j = start ; j < nums2.length ; j++ ) {
                if ( nums2[j] > nums1[i]) {
                    ans[i] = nums2[j] ; 
                    break ; 
                }
            }
        }

        return ans ; 
    }
}