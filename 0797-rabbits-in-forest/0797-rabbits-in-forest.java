class Solution {
    public int numRabbits(int[] answers) {
        int count = 0 ; 
        Map<Integer,Integer> map = new HashMap<>() ; 

        for ( int ele : answers ) {
            map.put(ele , map.getOrDefault(ele,0) + 1) ; 
        }

        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey() ; 
            int val = entry.getValue() ; 
            if ( val % (key+1) == 0 ) {
                count += (key + 1) * (val/(key+1));
            }else {
                count += (key + 1) * (val/(key+1)) + (key + 1) ; 
            }
        }

        return count ; 

    }
}