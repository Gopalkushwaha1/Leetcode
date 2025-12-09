class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> totalFreq = new HashMap<>() ; 
        HashMap<Integer, Integer> leftFreq = new HashMap<>() ; 

        long result = 0 ; 

        for ( int ele : nums ) {
            totalFreq.put(ele , totalFreq.getOrDefault(ele,0)+1) ; 
        }

        for ( int ele : nums ) {
            int target = ele * 2 ; 

            int left = leftFreq.getOrDefault(target , 0 ) ; 
            leftFreq.put(ele , leftFreq.getOrDefault(ele,0) + 1 ) ;
            int right = totalFreq.getOrDefault(target, 0) - leftFreq.getOrDefault(target , 0 ) ; 

            result =  (result + left * right ) % 1_000_000_007; 
             
        }

        return (int)result ; 
    }
}