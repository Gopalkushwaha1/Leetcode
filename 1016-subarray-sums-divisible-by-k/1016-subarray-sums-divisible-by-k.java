class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        map.put(0,1) ; 
        int ans = 0 , sum = 0 ;

        for ( int ele : nums ) {
            sum += ele ; 
            sum = sum%k ; 
            if ( sum < 0 ) {
                sum += k ; 
            }
            if ( map.containsKey(sum)) {
                ans += map.get(sum) ; 
                map.put(sum , map.get(sum)+1);
            }
            else {
                map.put(sum , 1 ) ; 
            }
        } 
        return ans ;  
    }
}