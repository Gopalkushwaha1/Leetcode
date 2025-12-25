class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness) ; 
        long ans = 0*1L ; 
        long decVal = -1; 
        int i = happiness.length - 2 ;
        ans += happiness[i+1] ; 

        while( i >= 0 && k > 1  && happiness[i] + decVal >= 0) {
                ans += happiness[i] + decVal ; 
                decVal-- ; 
                k-- ; 
                i-- ;  
        }

        return ans ; 
    }
}