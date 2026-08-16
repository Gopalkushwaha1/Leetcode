class Solution {
    public boolean stoneGameIX(int[] stones) {
        // count 
        int count0 = 0 ; 
        int count1 = 0 ; 
        int count2 = 0 ; 

        for ( int ele : stones ) {

            if( ele % 3 == 0 ) count0++ ; 
            else if( ele % 3 == 1 ) count1++ ; 
            else count2++ ; 

        }

        // if Count 0 is even then ...
        if ( count0 % 2 == 0 ) {

            return count1 >= 1 && count2 >= 1 ; 

        }

        return Math.abs( count1 - count2 ) > 2 ; 
    }
}