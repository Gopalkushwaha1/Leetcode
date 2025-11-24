class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>() ; 
        long sum = nums[0] ;
        if(nums[0] == 0 ) {
            ans.add(true) ; 
        } 
        else {
            ans.add(false) ; 
        }

        for ( int i = 1 ; i < nums.length ; i++  ) {
            sum = ((sum*2) + nums[i]) % 5 ; 
            if ( sum % 5 == 0 ) {
                ans.add(true) ; 
            }
            else{
                ans.add(false) ; 
            }
        }
        return ans ; 
    }
}