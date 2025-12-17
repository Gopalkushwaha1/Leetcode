class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>() ; 

        for (String str : strs ) {
            char[] ch = str.toCharArray() ; 
            Arrays.sort(ch) ; 
            String key = new String(ch) ;

            map.computeIfAbsent(key , k -> new ArrayList<>()).add(str) ;  
        }
        List<List<String>> ans = new ArrayList<>() ; 

        for ( List l : map.values()) {
            ans.add(new ArrayList(l)) ; 
        }

        return ans ; 
    }
}