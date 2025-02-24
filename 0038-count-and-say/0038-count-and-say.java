class Solution {
    public String countAndSay(int n) {
       if (n == 1 ) return "1" ; 
       String s = countAndSay(n-1)  + "@" ; 
       StringBuilder sb = new StringBuilder(); 
       int i = 0 , j = 0 ; 
       while ( j < s.length() ) {
        if(s.charAt(i) == s.charAt(j)){
            j++;
        }
        else {
            sb.append(j-i);
            sb.append(s.charAt(i));
            i = j ; 
            j++ ; 
        }
       } 
       return sb.toString() ; 
    }
}