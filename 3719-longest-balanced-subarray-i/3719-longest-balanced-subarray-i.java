class Solution {
    public int longestBalanced(int[] nums) {
       int ans = 0 ; 
       for ( int i = 0 ; i < nums.length ; i++ ) {
            Set<Integer> odd = new HashSet<>() ;
            Set<Integer> even = new HashSet<>() ;
         for ( int j = i ; j < nums.length ; j++ ) {
                if(nums[j] % 2 == 0 ) even.add(nums[j]) ; 
                else odd.add(nums[j]) ; 
                if(even.size() == odd.size() ) ans = Math.max(ans , j - i + 1 ) ; 
         }
       } 
       return ans ; 
    }
}