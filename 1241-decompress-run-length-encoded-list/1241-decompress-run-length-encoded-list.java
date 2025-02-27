class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < nums.length ; i+= 2) {
            int freq = nums[i] ; 
            int val = nums[i+1] ; 
            while ( freq != 0 ) {
                list.add(val) ; 
                freq--;
            }
        }
        int[] result = new int[list.size()];
        for ( int i = 0 ; i < list.size() ; i++ ) {
            result[i] = list.get(i) ;
        }
        return result ; 
    }
}