class Solution {
    public void sortColors(int[] nums) {
        int i = 0 ; 
        int j = 0 ; 
        int k = nums.length - 1 ; 

        while ( j < k ) {
            while(i < k && nums[i] == 0 ) i++ ; j++ ; 
            while ( k > i && nums[k] == 2 ) k-- ; 
            while ( j < k && nums[j] == 1 ) j++ ; 

            if (j <= k &&  nums[j] == 0 ) {
                nums[j] = nums[i] ;
                nums[i] = 0 ; 
                i++ ; 
            }
            if (k > i &&  nums[j] == 2 ) {
                nums[j] = nums[k] ; 
                nums[k] = 2 ; 
                k-- ; 
            }

        }
    }
}