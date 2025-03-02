class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] ans = new int[nums1.length+nums2.length][2] ; 

        int i = 0 , j = 0 , k = 0 , count = 0 ; 

        while ( i < nums1.length && j < nums2.length ) {
            int key1 = nums1[i][0] ; 
            int key2 = nums2[j][0] ; 
            int val1 = nums1[i][1] ;
            int val2 = nums2[j][1] ; 

            if ( key1 == key2 ) {
                ans[k][0] = key1 ; 
                ans[k][1] = val1 + val2 ; 
                count++;
                i++ ; j++ ; k++;
            }
            else if ( key1 < key2 ) {
                ans[k][0] = key1;
                ans[k][1] = val1 ; 
                i++ ; k++;
            }
            else {
                ans[k][0] = key2 ; 
                ans[k][1] = val2 ;
                j++ ; k++ ; 
            }
        } 
        if ( i < nums1.length ) {
            for ( int l = i ; l < nums1.length ; l++ ) {
                ans[k][0] = nums1[l][0] ;
                ans[k][1] = nums1[l][1] ; 
                k++;
            }
        }
        if ( j < nums2.length ) {
            for ( int  l = j ; l < nums2.length ; l++ ) {
                ans[k][0] = nums2[l][0] ;
                ans[k][1] = nums2[l][1] ; 
                k++;
            }
        }
        int[][] result = new int[ans.length-count][2] ; 
        for ( int l = 0 ; l < ans.length-count ; l++ ) {
            result[l][0] = ans[l][0] ; 
            result[l][1] = ans[l][1] ; 
        }
        return result ; 
    }
}