class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // take len 
        int len = nums.length ; 
        int count = 0 ;
        int lessCount = 0 ; 

        // Apply logic 
        for ( int ele : nums ) {
            if ( ele < target ) {
                lessCount++ ; 
            }
            else if ( ele == target ) {
                count++ ; 
            }
        }

        // Makeing list for store ans 
        List<Integer> list = new ArrayList<>() ; 
        // fill index 
        for ( int i = 0 ; i < count ; i++ ) {
            list.add( i + lessCount ) ; 
        }

        return list ; 
    }
}