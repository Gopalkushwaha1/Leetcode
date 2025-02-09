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
            String srev = reverse(s) ; 
            System.out.println(s + "->" + srev) ; 
            if ( set.contains(s) || set.contains(srev)) {
                
                countDuplicate++ ; 
                continue ; 
            } 
            set.add(s) ; 
            set.add(srev) ; 
        }
        return countDuplicate ; 
    }
}