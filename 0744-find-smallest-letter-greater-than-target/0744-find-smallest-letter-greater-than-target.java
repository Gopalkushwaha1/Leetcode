class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0 ; 
        int e = letters.length-1 ; 

        while ( s <= e ) {
            int mid = (s+e)/2 ; 
            char ch = letters[mid] ; 

            if(ch > target) {
                e = mid - 1 ; 
            }
            else {
                s = mid + 1 ; 
            }
        }

        if ( s == letters.length ) return letters[0] ; 

        return letters[s] ; 
    }
}