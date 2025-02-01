class Solution {
    // Function to check this mid value possible or not 
    public boolean isValid( int[] nums , int k , int mid ) {
        int count = 1 , idx = 0 , sum = 0 ; 

        // Travel each ele in array and check 
        while ( idx < nums.length ) {
            if ( count > k ) return false ; 
            
            // If ele is greater then mid not possbile 
            if ( nums[idx] > mid ) return false ;  
            // Check if possible 
            else if ( nums[idx] + sum <= mid ) {
                sum += nums[idx] ; 
                idx++ ; 
            }
            // If sum greater than mid split update 
            else {
                count++;
                sum = nums[idx] ; 
                idx++ ; 
            }   
        }
        return count <= k ;
    }
    public int splitArray(int[] nums, int k) {
        int min = 0 ; 
        int max = 0 ;

        // Calculating min max 
        for ( int ele : nums ) {
            min = Math.max ( ele , min ) ;
            max += ele ; 
        } 
        if ( k == 1 ) return max ;  
        // Max will be total sum minus min 
        max -= min ; 

        while ( min <= max ) {
            // Finding mid value check if possible 
            int mid = (min + max ) / 2 ; 
            // If possible then update in max 
            if ( isValid( nums , k , mid  )){
                max = mid - 1 ;
            }
            // If not then update min
            else {
                min = mid + 1 ; 
            } 
        
        }
        // Return min 
        return min ; 
    }
}