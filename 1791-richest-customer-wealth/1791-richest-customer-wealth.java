class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0 ; 

        for ( int[] num : accounts ) {
            int sum = 0 ; 
            for ( int ele : num ) {
                sum += ele ; 
            }
            max = Math.max(sum , max );
        }
        return max ; 
    }
}