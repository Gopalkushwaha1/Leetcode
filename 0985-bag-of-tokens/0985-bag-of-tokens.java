class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int ans = 0 , score = 0 , i = 0 , j = tokens.length - 1 ; 

        Arrays.sort(tokens) ; 

        while ( i <= j ) {
            int currPower = tokens[i] ; 
            if(currPower <= power ) {
                score++;
                power -= currPower ;
                i++ ; 
            } 
            else if ( power < tokens[j] && score > 0 ) {
                score-- ; 
                power += tokens[j--] ; 
            }
            else {
                break ; 
            }
            ans = Math.max(ans , score  ) ;
        }

        return ans ; 
    }
}