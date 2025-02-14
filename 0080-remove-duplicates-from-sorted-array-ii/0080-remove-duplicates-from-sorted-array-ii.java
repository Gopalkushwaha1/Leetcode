class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 , j = 2 , k = 2 ; 
        if ( nums.length == 2 ) return 2 ; 
        
        while ( j < nums.length && nums[j] != nums[i]) {
            j++ ; 
            i++ ; 
            k = j ; 
        } 
        while ( j < nums.length ) {
            if ( nums[j] == nums[i]) {
                j++;
            }
            else {
                nums[k] = nums[j] ; 
                j++ ; 
                k++;
                i++ ; 
            }

        }
        return k ; 
    }
}