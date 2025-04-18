class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int p) {
        int[] ans = new int[capacity.length] ; 
        for ( int i = 0 ; i < capacity.length ; i++ ) {
            ans[i] = capacity[i] - rocks[i] ; 

        }
        Arrays.sort(ans) ;
        int ans1 = 0 ;
        for ( int i = 0 ; i < ans.length ; i++ ) {
            System.out.print(ans[i] + " ") ; 
            if(ans[i] <= p ) {
                ans1++;
                p -= ans[i] ; 
            }
            else{
                return ans1 ; 
            }
        }
        return ans1 ; 
    }
}