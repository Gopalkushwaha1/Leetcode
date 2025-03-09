class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k] ; 
        arr[0] = 1 ; 
        int ans = 0 , sum = 0 ;

        for ( int ele : nums ) {
            sum += ele ; 
            sum = sum%k ; 
            if ( sum < 0 ) {
                sum += k ; 
            }
            if ( arr[sum] > 0 ) {
                ans += arr[sum] ; 
                arr[sum]++;
            }
            else {
                arr[sum] = 1 ; 
            }
        } 
        return ans ;  
    }
}