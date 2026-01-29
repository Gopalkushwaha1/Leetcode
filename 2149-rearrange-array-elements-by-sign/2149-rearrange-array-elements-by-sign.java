class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] postive = new int[nums.length/2] ; 
        int[] negative = new int[nums.length/2] ;
        int p = 0 ; 
        int n = 0 ; 

        for ( int ele : nums ) {
            if(ele < 0 ) {
                negative[n++] = ele ; 
            }else {
                postive[p++] = ele ; 
            }
        } 
        p=0;
        n=0;
        int i = 0 ; 

        while ( p + n != nums.length ) {
            if(i%2 == 0 ) {
                nums[i++] = postive[p++] ; 
            }
            else {
                nums[i++] = negative[n++] ; 
            }
        }

        return nums ; 
    }
}