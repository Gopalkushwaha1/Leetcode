class Solution {
    public int compareVersion(String v1, String v2) {

       // Define variable 
       int i  = 0 , j = 0 ; 
       // checking all version separate by '.'   
       while ( i < v1.length() || j < v2.length() ) {
        // variable of comapre version v1 and v2 
        int num1 = 0 , nums2 = 0 ; 
        // calculating version v1 
        while ( i < v1.length() && v1.charAt(i) != '.') { 
            num1 = num1 * 10 + (v1.charAt(i) - '0' ) ; 
            i++ ; 
        }
        // calculating version v2 
        while ( j < v2.length() && v2.charAt(j) != '.') {
            nums2 = nums2 * 10 + (v2.charAt(j) - '0' ) ; 
            j++ ; 
        }
        // checking condition 
        if ( num1 > nums2 ) return 1 ;
        else if ( nums2 > num1) return -1 ; 
        // update i & j if not satisfy condition 
        i++ ; j++ ;
         
       }

       return 0 ; // return 0 if version not greater 
    }
}