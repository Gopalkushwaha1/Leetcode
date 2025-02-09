class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int[] ans = new int[]{-1,-1} ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            int rem = target - nums[i] ; 
            if ( map.containsKey(rem)) {
                ans[0] = i ; 
                ans[1] = map.get(rem) ; 
            } 
            else {
                map.put(nums[i] , i ) ; 
            }
        } 
        return ans ; 
    }
}