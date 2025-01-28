class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0  , end = 0 , maxlen = 0 ;

        while ( end < s.length() ) {

            maxCost -= Math.abs( s.charAt(end) - t.charAt(end)) ; 

            while ( maxCost < 0 ) {

                maxCost += Math.abs ( s.charAt( start ) - t.charAt(start) ) ;
                start++ ;

            }
            maxlen = Math.max ( maxlen , end - start + 1 ) ; 
            end++ ; 

        }
        return maxlen ; 
    }
}