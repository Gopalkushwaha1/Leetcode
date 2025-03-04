class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 ; 
        Map<Integer,Integer> set = new HashMap<>() ; 

        for ( int ele : nums ) {
            if ( set.containsKey(ele)) {
                int freq = set.get(ele) ; 
                if ( freq >= nums.length/2) {
                    return ele ; 
                }
                set.put(ele,freq+1);
            }
            else {
                set.put(ele,1);
            }
        }
        return nums[0] ; 
    }
}