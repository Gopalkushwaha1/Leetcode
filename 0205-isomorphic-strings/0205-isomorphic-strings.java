class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>() ; 
        boolean[] check = new boolean[128] ; 

        for ( int i = 0 ; i < s.length() ; i++  ) {
            if(map.containsKey(s.charAt(i))){
                char c = map.get(s.charAt(i)) ; 
                if ( c == t.charAt(i)) {
                    continue ; 
                }
                else {
                    return false ; 
                }
            }
            else {
                char c = t.charAt(i) ; 
                if ( check[c] == true ) return false ; 
                map.put(s.charAt(i) , t.charAt(i)) ; 
                check[c] = true ; 
            }
        }
        return true ; 
    }
}