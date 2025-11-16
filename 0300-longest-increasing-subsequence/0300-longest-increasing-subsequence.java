class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length+1] ; 
        Arrays.fill(arr , 1) ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = 0 ; j < i ; j++ ) {

                if ( nums[i] > nums[j] && arr[j] <= arr[i]) {
                    arr[i] = Math.max(arr[i] , arr[j] + 1); 
                }
            }
        }
        int max = 0 ; 
        for ( int ele : arr ) {
            max = Math.max(ele,max) ; 
        }

        return max ; 
    }
}