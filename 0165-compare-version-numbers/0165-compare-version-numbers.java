class Solution {
    public int compareVersion(String v1, String v2) {
       int i  = 0 , j = 0 ; 

       while ( i < v1.length() || j < v2.length() ) {

        int num1 = 0 , nums2 = 0 ; 
        System.out.println("num1 " + num1) ;
        while ( i < v1.length() && v1.charAt(i) != '.') {
            int a = v1.charAt(i) - '0' ; 
            System.out.println("n " + i + " " + a );
            
            num1 = num1 * 10 + a ; 
            System.out.println("num1 " + num1) ;
            i++ ; 
        }
        System.out.println("num1 " + num1) ;
        while ( j < v2.length() && v2.charAt(j) != '.') {
            nums2 = nums2 * 10 + (v2.charAt(j) - '0' ) ; 
            j++ ; 
        }
        System.out.println("num2" + nums2) ;
        if ( num1 > nums2 ) return 1 ;
        else if ( nums2 > num1) return -1 ; 
        i++ ;
        j++ ; 
       }
       return 0 ; 
    }
}