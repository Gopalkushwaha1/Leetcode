class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        
        // Make the Augmented string 
        StringBuilder sb = new StringBuilder() ; 
        sb.append("1") ; 
        sb.append(s) ; 
        sb.append("1") ; 

        // take list to store alternate len 0/1
        List<Integer> list = new ArrayList<>() ; 

        // fill the list 
        int count = 0 ; 
        int i = 0 ; 
        int j = 0 ; 

        while ( j < sb.length() ) {

            // if i && j have same value then count++ 
            if( sb.charAt(i) == sb.charAt(j)) {
                count++ ; 
                j++ ; 
                continue ; 
            }

            // new Alternate start 
            list.add(count) ; 
            count = 0 ; 
            i = j ; 
        }

        int max = 0 ;  // to get max 0 --> 1 

        for ( i = 2 ; i < list.size() - 1 ; i += 2 ) {

            max = Math.max(max , list.get(i-1) + list.get(i+1)) ; 
        }

        // fint total count of 1 
        int oneCount = 0  ; 
        for ( char ch : s.toCharArray()) {
            if( ch == '1') oneCount++ ; 
        }

        // return total one + 0-->1 
        return max + oneCount ; 
    }
}