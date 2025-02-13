class Solution {
    // Function for reverse num 
    public int rev(int ele ) {
        int rev = 0 ; 
        while ( ele != 0 ) {
            rev = rev * 10 + ele % 10 ; 
            ele /= 10 ; 
        }
        return rev ; 
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        int count = 0 ; 

        for ( int ele : nums ) {
            int key = ele - rev(ele) ; 
            // Check in map 
            if ( map.containsKey(key)) {
                int freq = map.get(key) ; 
                count += freq ; 
                count = count  % 100_000_0007 ; 
                map.put(key , freq+1 ) ; 
            }
            else {
                map.put(key , 1 ) ; 
            }
        }
        return count ; 
    }
}