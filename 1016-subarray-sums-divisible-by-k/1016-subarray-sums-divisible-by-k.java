class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k] ; 
        arr[0] = 1 ; 
        int ans = 0 , sum = 0 ;
        for ( int ele : nums ) { 
            sum = (sum+ele)%k ; 
            if ( sum < 0 ) sum += k ;
            ans += arr[sum] ; 
            arr[sum]++;
        } 
        return ans ;  
    }
}