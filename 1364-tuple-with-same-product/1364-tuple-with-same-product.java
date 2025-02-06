class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>() ; 
        int count = 0 ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = i + 1 ; j < nums.length ; j++ ) {
                int product = nums[i] * nums[j] ; 
                map.put(product , map.getOrDefault(product , 0 )  + 1 ) ; 
            }
        }
        for ( int c : map.values()) { 
            if ( c > 1 ) {
                count += c * (c  - 1 ) * 4 ; 
            }
        }
        return count ; 
    }
}