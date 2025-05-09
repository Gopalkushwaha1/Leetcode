class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>() ; 

        if ( strs.length == 0 ) {
            return ans ; 
        }

        HashMap<String , List<String>> map = new HashMap<>() ; 

        for ( String s : strs ) {
            char[] ch = s.toCharArray() ; 
            Arrays.sort(ch) ; 

            String rev = String.valueOf(ch) ; 

            if(!map.containsKey(rev)) {
                map.put(rev , new ArrayList<>()) ; 
            }
            map.get(rev).add(s) ; 
        }

        return new ArrayList<>(map.values()) ; 
    }
}