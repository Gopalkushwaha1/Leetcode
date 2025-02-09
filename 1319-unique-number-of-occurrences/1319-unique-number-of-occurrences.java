class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        HashSet<Integer> set = new HashSet<>() ; 

        for ( int ele : arr ) {
            if(map.containsKey(ele)) {
                int count = map.get(ele) ; 
                map.put(ele , count + 1 ) ; 
            }
            else {
                map.put(ele , 1 ) ; 
            }
        }

        for ( int ele : map.values()) {
            if(set.contains(ele)) {
                return false ; 
            }
            else {
                set.add(ele) ; 
            }
        }
        return true ; 
    }
}