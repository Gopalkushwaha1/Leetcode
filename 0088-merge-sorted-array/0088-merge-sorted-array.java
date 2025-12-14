class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( n == 0 ) return ; 
        if ( m == 0 ) {
            for ( int i = 0 ; i < n ; i++ ) {
                nums1[i] = nums2[i] ; 
            }
            return ; 
        }
        int n1 = nums1.length-1 ; 
        int n11 = m-1 ; 

        int n2 = n -1 ; 

        while ( n11 >= 0  && n2 >= 0 ) {
            if ( nums2[n2] >= nums1[n11] ) {
                nums1[n1] = nums2[n2] ; 
                n1-- ; 
                n2-- ; 
            }
            else {
                nums1[n1] = nums1[n11] ; 
                n1-- ; 
                n11-- ; 

            }
        }
        if ( n1 >= 0  && n2 >= 0 ) {
            for ( int i = 0 ; i <= n2 ; i++ ) {
                nums1[i] = nums2[i] ; 
            }
        }
    }
}