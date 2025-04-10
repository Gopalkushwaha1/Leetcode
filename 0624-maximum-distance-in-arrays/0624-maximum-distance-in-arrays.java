class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0) ; 
        int max = arrays.get(0).get(arrays.get(0).size() - 1) ; 
        int ans = 0 ; 

        for ( int i= 1 ; i < arrays.size() ; i++ ) {
            int localMin = arrays.get(i).get(0) ; 
            int localMax = arrays.get(i).get(arrays.get(i).size() - 1 ) ; 

            ans = Math.max(ans , Math.abs(min-localMax));
            ans = Math.max(ans , Math.abs(max -localMin)) ; 

            if ( localMin < min ) min = localMin ; 
            if ( localMax > max ) max = localMax ; 

        }

        return ans ; 
    }
}