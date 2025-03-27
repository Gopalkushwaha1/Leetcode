class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>() ; 
        int maxEle = 0 , count = 0 ; 

        for ( int i = 0 ; i < nums.size() ; i++ ) {
            map.put(nums.get(i) , map.getOrDefault(nums.get(i) , 0 )+ 1) ; 
        }

        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            if ( count < entry.getValue()){
                maxEle = entry.getKey();
                count = entry.getValue();
            }
        }
        int[] ans = new int[nums.size()]; 
        count = 0 ; 
        for ( int i = 0 ; i < nums.size() ; i++ ) {
            if ( nums.get(i) == maxEle) {
                ans[i] = ++count;
            }
            else {
                ans[i] = count ; 
            }
        }
        for ( int i = 0 ; i < ans.length-1 ; i++ ) { 
            int left = ans[i]*2 ;
            int right = (ans[ans.length-1] - ans[i])*2 ;  
            if(left > i+1 && right > ans.length - (i+1) ) return i ; 
        } 
        return -1; 
    }
}