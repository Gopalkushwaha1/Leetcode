class Solution {
    public int numberOfSubstrings(String s) {
       int start = 0 ;  
       int end = 0 ; 
       int n = s.length() - 1 ; 
       int count = 0 ;
       int[] arr = new int[3]; // to store count of a , b , c 

       while ( end < s.length() ) {
        int idx = s.charAt(end) ; // geting idx of char a -> 0 , b -> 1 , c -> 2 
        arr[idx - 'a']++ ;        // update the occureance of char by 1 
        while ( arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1 ) { //if all came (a,b,c)then update the count 
            count += n - end + 1 ;
            arr[s.charAt(start) - 'a']--;
            start++;
        }
        end++;
       }
       return count ;   // return count 
    }
}