class Solution {
    public int countSeniors(String[] details) {

        int count = 0 ; 
        for ( int i = 0 ; i < details.length ; i++ ) {
            String s = details[i] ;  
            System.out.println(s.charAt(11) + " " + s.charAt(12)) ; 
            int num = s.charAt(11) - '0' ;
            int num2 = s.charAt(12) - '0' ;  
            if ( num > 6 || ( num == 6 && num2 > 0)  ) {
                count++;
            }
        }
        return count ; 
    }
}