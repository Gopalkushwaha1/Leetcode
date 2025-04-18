class Solution {
    public int brokenCalc(int start, int target) {
        int count = 0 ; 
        while ( target != start ) {
            if ( target < start ) {
                count += start - target ;
                return count ; 
            }
            if(target %2 != 0 ) {
                count += 2 ; 
                target = (target+1)/2;
            }
            else {
                count++;
                target /= 2 ; 
            }
        }
        return count ; 
    }
}