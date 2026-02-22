class Solution {
    public int binaryGap(int n) {
        // change n into binary number 

        String binary = Integer.toBinaryString(n) ; 

        // take curr and prev 
        int currIdx = 0 ; 
        int prevIdx = 0 ; 
        int maxDistance = 0 ; 

        // travel 0 ..........n and find the distance 

        while ( currIdx < binary.length() ) {
            
            // if currIdx is 1 then find the maxDistance and update the prev 
            if(binary.charAt(currIdx) == '1') {
                maxDistance = Math.max(maxDistance , currIdx - prevIdx) ; 
                prevIdx = currIdx ; 
            }

            // update currIdx 
            currIdx++ ; 
        }

        // return ans 
        return maxDistance ; 
    }
}