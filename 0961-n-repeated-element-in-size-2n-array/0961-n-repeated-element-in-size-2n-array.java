class Solution {
    public int repeatedNTimes(int[] nums) {
        int count = nums.length/2 ; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 

        for ( int ele : nums ) {
            map.put(ele , map.getOrDefault(ele,0)+1) ; 
            if(map.get(ele) == count ) return ele ; 
        } 
        return 0 ; 
    }
}

// 1 + 2 + 3 +  