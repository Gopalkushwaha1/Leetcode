class Solution {
    public int binaryGap(int n) {
        // change n into binary String 

        String binary = Integer.toBinaryString(n) ; 

        // take curr and prev idx 
        int currIdx = 0 ; 
        int prevIdx = 0 ; 
        int maxDistance = 0 ;

        while ( currIdx < binary.length()) {
            if(binary.charAt(currIdx) == '1') {
                maxDistance = Math.max(maxDistance , currIdx - prevIdx) ; 
                // update the prev to curr 
                prevIdx = currIdx ; 
            }

            // update currIddx 
            currIdx++ ; 
        }

        // return ans 
        return maxDistance ; 
    }
}