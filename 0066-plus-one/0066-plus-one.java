class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length -1 ; 

        while ( j >= 0 ) {
            if(digits[j] == 9 ) {
                digits[j] = 0 ; 
            }
            else {
                digits[j] += 1 ; 
                return digits ; 
            }
            j-- ; 
        }
        int[] ans = new int[digits.length+1] ; 
        ans[0] = 1 ; 
        return ans ; 
    }
}