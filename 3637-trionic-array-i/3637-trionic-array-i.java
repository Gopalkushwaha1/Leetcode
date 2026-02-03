class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length ; 
        if ( n < 4 ) return false ; 

        int i = 1 ; 

        while ( i < n && nums[i] > nums[i-1]) i++ ; 
        if(i == 1 || i == n ) return false ; 

        int mid = i ; 
        while ( i < n && nums[i] < nums[i-1] ) i++ ; 
        if(i == mid || i == n ) return false ; 

        while ( i < n && nums[i] > nums[i-1])i++ ; 

        return i == n ; 
    }
}