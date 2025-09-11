class Solution {
    public String sortVowels(String s1) {
        char[] s = s1.toCharArray() ; 
        StringBuilder sb = new StringBuilder(s1) ; 
        int[] arr = new int[s1.length()] ;  
        ArrayList<Character> list = new ArrayList<>() ; 
        for ( int i = 0 ; i < s1.length() ; i++ ) {
            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') { 
                list.add(s[i]) ; 
            }
        }
        Collections.sort(list , Collections.reverseOrder()) ; 
        int l = 0  ; 
        for ( int i = s1.length() - 1 ; i >= 0  ; i-- ) {
            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {

                sb.setCharAt(i , list.get(l++)) ; 
            }
        }
        return sb.toString() ; 
    }
}