class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create the ans 
        int[] ans = new int[2] ; 
        int n = nums.length ; 
        // fix first value -> idx 
        for ( int i = 0 ; i < n ; i++ ) {
            int ele = nums[i] ; 

            for ( int j = i + 1 ; j < n ; j++ ) {
                // Check the condition
                if ( ele + nums[j] == target ) {
                    int index1 = i ; 
                    int index2 = j ; 

                    ans[0] = index1 ; 
                    ans[1] = index2 ; 
                    break ; 
                }
            }

        }
        return ans ; 
    }
}