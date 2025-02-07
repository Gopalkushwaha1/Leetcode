class Solution {
    public int appendCharacters(String s, String t) {
         int slen = s.length() ; 
         int tlen = t.length() ; 
         int i = 0 , j = 0 ; 

         while ( j < tlen && i < slen ) {
             if ( s.charAt(i) == t.charAt(j)){
                System.out.print(j + " ");
                 System.out.print(j + " ");
                j++; 
             }
             i++ ; 
         } 
         
         System.out.print(j);
         return tlen - j ; 
    }
}