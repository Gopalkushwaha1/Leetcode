class Solution {
    public int scoreDifference(int[] nums) {
        // take 3 variabe 

        int firstScore = 0 ; 
        int secondScore = 0 ; 
        int active = 1   ;      // 1 -> Player 1 active   2 -> Player 2 active 


        // travel 0 ..................n 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            // check nums[i] odd -> swap 

            if(nums[i] % 2 != 0 ) {
                if(active == 1 ) {
                    active = 2 ; 
                }
                else {
                    active = 1 ; 
                }
            }

            // 6th game 

            if( (i + 1)  % 6 == 0 ) {
                if(active == 1 ) {
                    active = 2 ; 
                }
                else {
                    active = 1 ; 
                }
            }

            if(active == 1 ) {
                firstScore += nums[i] ; 
            }
            else {
                secondScore += nums[i] ; 
            }
        }

        // return firstPlayer score - secondPlayer score 

        return firstScore - secondScore ; 
    }
}