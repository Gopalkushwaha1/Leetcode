class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<>() ; 
        int ans = 0 ; 

        for ( int ele : tasks ) {
            map.put(ele , map.getOrDefault(ele,0) + 1 ) ; 
        }

        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer val = entry.getValue() ;
            if ( val == 1 ) return -1 ;
            ans += val%3 == 0 ? val/3 : (val/3) + 1 ; 
        }

        return ans ; 
    }
}