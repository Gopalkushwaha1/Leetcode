class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer > map = new HashMap<>() ; 
        int i = 0 , j = 0 , ans = 0 ; 

        while ( j < s.length() ) {
            char c = s.charAt(j) ; 
            while ( map.containsKey(c)) {
                map.remove(s.charAt(i)) ; 
                i++ ; 
            }
            map.put(c , j ) ; 
            ans = Math.max(ans , map.size()) ; 
            j++ ; 
        }
        return ans ; 
    }
}