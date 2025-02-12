class Solution {
    public int sumDigit(int ele ) {
        int sum = 0 ; 
        while ( ele != 0 ) {
            sum += ele % 10 ; 
            ele /= 10 ; 
        }
        return sum ; 
    }
    public int maximumSum(int[] nums) {
        int[] arr = new int[82] ; 
        int ans = -1 ; 

        for ( int ele : nums ) {
            int idx = sumDigit(ele) ; 

            if ( arr[idx] != 0 ) {
                ans = Math.max ( ans , ele + arr[idx]) ; 
            }
            arr[idx] = Math.max ( ele , arr[idx] ) ; 
        }

        return ans ; 
    }
}