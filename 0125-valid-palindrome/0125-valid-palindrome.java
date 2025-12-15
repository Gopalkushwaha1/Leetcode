class Solution {
    public boolean isValid(Character ch ) {
        String str = String.valueOf(ch); 
        return str.matches("[A-Za-z0-9]") ; 
    }
    public boolean isPalindrome(String s) {
        int i = 0 ; 
        int j = s.length() - 1 ; 

        while ( i <= j ) {
            while ( i <= j && !isValid(s.charAt(i))) i++ ; 
            while ( i <= j && !isValid(s.charAt(j))) j-- ; 
            if (i <= j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false ; 
            i++ ; 
            j-- ; 
        }

        return true ; 
    }
}