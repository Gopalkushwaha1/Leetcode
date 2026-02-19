class Solution {
    public int countBinarySubstrings(String s) {
        // take count , prev and curr Group 

        int count = 0 ; 
        int currGroup = 1 ; 
        int prevGroup = 0 ; 

        // find the group 
        for ( int i = 1 ; i < s.length() ; i++ ) {
            // if prev char equal curr char increase curr group size 
            if(s.charAt(i) == s.charAt(i-1)) currGroup++ ; 
            else { // update the count and currGroup 
                count += Math.min(currGroup , prevGroup) ; 
                prevGroup = currGroup ; 
                currGroup = 1 ; 
            }
        }

        return count + Math.min(currGroup , prevGroup) ; 
    }
}