class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3] ; 
        int start = 0 ;
        int end = 0 ; 
        int count = 0 ;

        while ( end < s.length() ) {
            char ch = s.charAt(end) ;
            int idx = ch  - 'a' ;
            arr[idx]++ ;

            // checking if count of 'a' 'b' 'c' is > 1 then it is valid find count
            while ( arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 ) {
                count += s.length() - end ; 

                // Slink the window 
                arr[s.charAt(start) - 'a']--;
                start++ ; 
            }
            end++ ; 
        }
        return count ;
    }
}