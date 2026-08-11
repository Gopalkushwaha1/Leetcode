class Solution {
    public int missingInteger(int[] nums) {
        // Take HashSet 
        HashSet<Integer> set = new HashSet<>() ; 
        int max = Integer.MIN_VALUE ; 

        // putting all element in hashset
        for ( int ele : nums ) {
            set.add(ele) ; 
            max = Math.max(max , ele ) ;    // find max 
        }

        // find sequential break 
        int sum = nums[0] ; 

        for ( int i = 1 ; i < nums.length ; i++ ) {
            if(nums[i] != nums[i-1] + 1 ) break ; 
            sum += nums[i] ; 
        }

        // sum > max return sum 
        if( sum > max ) return sum ; 

        // check array contians sum :: -> Find smallest missing integer 
        for ( int i = sum ; i <= max ; i++ ) {
            if( !set.contains(i)) return i ; 
        }

        return max + 1 ; 
    }
}