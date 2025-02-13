class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {0,0} ; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 

        for ( int i = 0 ; i < numbers.length ; i++ ) {
            int req = target - numbers[i] ; 

            if ( map.containsKey(req)) {
                int idx = map.get(req) ; 
                ans[0] = idx ; 
                ans[1] = i + 1 ; 
                break ; 
            }
            else {
                map.put(numbers[i] , i + 1) ; 
            }
        } 
        return ans ; 
    }
}