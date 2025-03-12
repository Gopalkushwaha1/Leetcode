class Solution {
    public int positive(int[] nums ) {
        int start = 0 , end = nums.length -1 ; 

        while  ( start <= end ) {
            int mid = (start + end) / 2 ; 

            if ( nums[mid] > 0 ) {
                end = mid - 1 ;  
            }
            else {
                start = mid + 1 ;  
            }
        }
        return start ; 
    }
    public int negativeEnd(int[] nums ) {
        int start = 0 , end = nums.length-1 ; 

        while ( start <= end ) {
            int mid = (start+end)/2 ; 

            if ( nums[mid] >= 0 ) {
                end = mid - 1 ; 
            }
            else {
                start = mid + 1 ; 
            }
        }
        return end ; 
    }
    public int maximumCount(int[] nums) {
        int i = 0 , j = nums.length , count = 0 ;

        int negtaivEnd = negativeEnd(nums) ; 
        int povStart = positive(nums) ; 

        System.out.print(negtaivEnd + " " + povStart) ; 

        return Math.max ((negtaivEnd+1) , (j-povStart) ) ; 
    }
}