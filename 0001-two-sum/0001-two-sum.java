class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create HashMap 
        int[] ans = new int[2] ; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int n = nums.length ; 
        map.put(nums[0] , 0 ) ; 
        // travel on nums check req sum --> map 

        for ( int i = 1 ; i <  n ; i++ ) {
            int ele = nums[i]  ; 
            int reqSum = target - ele; 

            if ( map.containsKey(reqSum)) {
                int idx1 = map.get(reqSum) ; 
                int idx2 = i ; 

                ans[0] = idx1 ; 
                ans[1] = idx2 ; 

                break ; 
            }
            map.put(ele , i ) ; 
        }
        return ans ; 
    }
}