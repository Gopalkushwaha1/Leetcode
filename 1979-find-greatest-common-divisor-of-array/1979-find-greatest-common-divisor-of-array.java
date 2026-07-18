class Solution {

    // function to get gcd 
    public int gcd( int a , int b ) {
        if( b == 0 ) return a ; 

        return gcd( b , a % b ) ; 
    }
    public int findGCD(int[] nums) {
        
        // Find max and min 
        int max = Integer.MIN_VALUE ; 
        int min = Integer.MAX_VALUE ; 

        for ( int ele : nums ) {
            max = Math.max( max , ele ) ; 
            min = Math.min ( min , ele ) ; 
        }

        return gcd(max , min) ;  // get gcd 
    }
}