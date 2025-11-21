class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] FirstIdx = new int[26] ; 
        int[] LastIdx = new int[26] ; 
        Arrays.fill(FirstIdx , -1) ; 

        for ( int i = 0 ; i < s.length() ; i++ ) {
            if(FirstIdx[s.charAt(i) - 'a'] == -1 ) {
                FirstIdx[s.charAt(i)-'a'] = i ;
            }
            LastIdx[s.charAt(i)-'a'] = i ; 
        }

        int count = 0 ; 
        for ( int i = 0 ; i < 26 ; i++ ) {
            if(FirstIdx[i] == -1 ) continue ; 
            int end = LastIdx[i] ; 
            HashSet<Character> set = new HashSet<>() ; 
            for ( int j = FirstIdx[i]+1 ; j < end ; j++ ) {
                set.add(s.charAt(j)) ; 
            }
            count += set.size() ; 
        }
        return count ; 
    }
}