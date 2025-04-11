class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0 ; 

        for ( int i = 0 ; i < colors.length()-1 ; i++ ) {
            if(colors.charAt(i) != colors.charAt(i+1)) continue ; 
            int j = i ,  sum = 0 , max = 0 ; 
            while ( j < colors.length() - 1 && colors.charAt(j) == colors.charAt(j+1) ) {
                sum += neededTime[j] ; 
                max = Math.max(max , neededTime[j]) ; 
                i++;
                j++; 
            } 
            sum += neededTime[j];
            max = Math.max(max , neededTime[j]) ; 
            ans += (sum - max) ; 
        }

        return ans ; 
    }
}