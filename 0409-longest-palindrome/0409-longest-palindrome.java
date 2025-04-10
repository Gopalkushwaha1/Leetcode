class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128] ; 

        for ( char c : s.toCharArray()){
            arr[c-'A']++ ; 
        } 
        boolean odd = false ; 
        int count = 0 ; 
        int max = 0 ; 

        for ( int ele : arr ) {
            System.out.print(ele + " ") ; 
            if(ele % 2 == 0 ) {
                count += ele ; 
            }
            else if(ele %2 != 0 ) {
                count += ele -1 ;  
                odd = true ; 
            }
        }

        return odd == true ? count + 1 : count ; 
    }
}