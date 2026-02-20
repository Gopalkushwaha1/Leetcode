class Solution {
    public String makeLargestSpecial(String s) {
        // base case 
        int balance = 0 ; 
        int start = 0 ; 
        StringBuilder sb = new StringBuilder() ; 
        List<String> list = new ArrayList<>() ; 


        if(s.length() <= 2 ) return s ; 


        for ( int i = 0 ; i < s.length() ; i++ ) {

            // update balance 
            if(s.charAt(i) == '1') balance++ ; 
            else balance-- ; 


            // if balance 0 then block found 
            // order kro 

            if(balance == 0 ) {
                // find the block part 
                String str = s.substring(start+1 , i ) ; 
                list.add("1" + makeLargestSpecial(str) + "0") ; 
                start = i+ 1 ; 
            }
        } 

        // sort and reverse 
        list.sort(Collections.reverseOrder()) ; 

        // join the block all 
        for ( String s1 : list ) {
            sb.append(s1) ; 
        }

        // convert into string and return 

        return sb.toString();
    }
}