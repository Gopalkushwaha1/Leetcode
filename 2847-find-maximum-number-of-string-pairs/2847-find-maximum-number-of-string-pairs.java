class Solution {
    public String reverse(String s ) {
        char[] ch = s.toCharArray() ; 
        int start = 0 , end = s.length() - 1 ; 
        while ( start <= end ) {
            char temp = ch[start] ; 
            ch[start] = ch[end] ; 
            ch[end] = temp ; 
            start++ ; end-- ; 
        }
        return new String(ch) ; 
    }
    public int maximumNumberOfStringPairs(String[] words) {
        // Creating HashSet to store distinct string 
        Set<String> set = new HashSet<>() ; 
        int countDuplicate = 0 ; 

        for  (int i = 0 ; i < words.length ; i++ ) {
            String s = words[i] ; 
            if ( set.contains(reverse(s))) countDuplicate++ ; 
            set.add(s) ;  
        }
        return countDuplicate ; 
    }
}