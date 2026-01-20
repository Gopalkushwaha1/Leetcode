class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLen = m + n -1; 

        while ( totalLen >= 0 && n > 0 && m > 0 ) {
            if(nums2[n-1] > nums1[m-1]) {
                nums1[totalLen] = nums2[n-1] ; 
                totalLen-- ; 
                n-- ; 
            }
            else {
                nums1[totalLen] = nums1[m-1] ; 
                totalLen-- ; 
                m-- ; 
            }
        }
        if( m == 0 ) {
            for ( int i = 0 ; i < n ; i++ ) {
                nums1[i] = nums2[i] ; 
            }
        }
    }
}