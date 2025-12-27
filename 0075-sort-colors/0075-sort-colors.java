class Solution {
    public void sortColors(int[] nums) {
        int count1 = 0 ; 
        int count2 = 0 ; 

        for ( int ele : nums ) {
            if(ele == 1 ) count1++ ; 
            if(ele == 2 ) count2++ ; 
        }
        Arrays.fill(nums , 0 ) ; 
        for ( int i = nums.length - (count1 + count2) ; i < nums.length ; i++ ) {
            if(count1 >= 1 ) {
                nums[i] = 1 ; 
                count1-- ; 
            }
            else {
                nums[i] = 2 ; 
            }
        }
    }
}