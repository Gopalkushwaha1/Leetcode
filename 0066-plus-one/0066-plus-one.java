class Solution {
    public int[] plusOne(int[] digits) {
        if ( digits.length == 1 && digits[0] != 9 ) {
            digits[0] += 1 ; 
            return digits ; 
        }
        int check = digits.length - 1 ; 
        while( check >= 0 && digits[check] == 9 ) {
            check-- ; 
        }
        if ( check > 0  ) {
            digits[check] += 1 ; 
            for ( int i = check + 1 ; i < digits.length ; i++ ) {
                digits[i] = 0 ; 
            }
            return digits ; 
        }
        int[] ans = new int[digits.length+1] ; 
        ans[0] = 1 ; 
        return ans ; 
    }
}