class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // taking HashMap for freq count 
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int i = 0 ; 
        int j = 0 ; 
        int maxLen = 0 ; 

        // Apply slide window 
        while ( i < nums.length ) {

            int ele = nums[i] ; 
            map.put(ele , map.getOrDefault(ele,0)+1) ; 

            // reduce the window when freq of ele > k 
            while ( map.get(ele) > k ) {
                int frontEle = nums[j] ; 
                int freq = map.get(frontEle) ; 
                map.put(frontEle , freq-1) ; 
                j++ ; 
            }

            // Update the maxLen 
            maxLen = Math.max(maxLen , (i - j ) + 1 ) ; 
            i++ ; 
        }

        return maxLen ; 
    }
}