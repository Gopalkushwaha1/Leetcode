class Solution {
    public int maxScore(String s) {
        int one = 0 , zero = 0 ; 
        for ( int i = 0 ; i< s.length() ; i++ ) {
            if ( s.charAt(i) == '1') one++ ; 
        }
        if ( s.length() == one) return one-1 ; 
        int i = 0 ; 
        int count = 0 ; 
        while ( i < s.length() - 1 ) {
            if ( s.charAt(i) == '0'){
                zero++;
            }
            else{
                one--;
            }
            i++;
            count = Math.max(count , one+zero);
        }
        
        return count ; 
    }
}