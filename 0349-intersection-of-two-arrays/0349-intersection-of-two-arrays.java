class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ans = new int[1001] ; 

        for ( int ele : nums1 ) {
            ans[ele] = 1 ; 
        }
        int count = 0 ; 

        for ( int ele : nums2 ) {
            if ( ans[ele] == 2 ) continue ; 
            if ( ans[ele] > 0 ) {
                count++;
                ans[ele] = 2 ; 
            }
        }
        int[] result = new int[count] ; 
        int j = 0 ; 

        for ( int i = 0 ; i < ans.length ; i++ ) {
            if ( ans[i] > 1 ) {
                result[j++] = i ; 
            }
        }
        return result ; 
    }
}