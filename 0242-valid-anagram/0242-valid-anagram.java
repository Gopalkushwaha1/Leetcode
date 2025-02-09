class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length()) return false ; 
        HashMap<Character , Integer > map = new HashMap<>() ;
        HashMap<Character , Integer > map2 = new HashMap<>() ;  

        for ( int i = 0 ; i < s.length() ; i++ ) {
            if ( map.containsKey(s.charAt(i))){
                int prev = map.get(s.charAt(i)) ; 
                map.put(s.charAt(i) , prev + 1 ) ; 
            }
            else {
                map.put(s.charAt(i) , 1 ) ; 
            }
        }
        for ( int i = 0 ; i < t.length() ; i++ ) {
            if ( map2.containsKey(t.charAt(i))) {
                int prev = map2.get(t.charAt(i)) ; 
                map2.put ( t.charAt(i) , prev + 1 ) ; 
            }
            else {
                map2.put ( t.charAt(i) , 1 ) ; 
            }
        }

        for ( int i = 0 ; i < s.length() ; i++ ) {
            char c = s.charAt(i) ; 
            int freq = map.get(c) ; 
            if (!map2.containsKey(c)) return false ; 
            if ( freq != map2.get(c)) {
                return false ; 
            }
        }
        return true ; 
    }
}