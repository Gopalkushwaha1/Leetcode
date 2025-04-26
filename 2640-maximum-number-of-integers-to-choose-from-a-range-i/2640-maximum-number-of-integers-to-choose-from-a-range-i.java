class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>() ; 

        for ( int ele : banned ) {
            set.add(ele) ; 
        }

        int count = 0 , sum = 0 , i = 1 ; 

        while ( sum +i <= maxSum && i <= n ) {
            if(!set.contains(i)){
               count++ ; 
                sum += i ; 
            }
            i++ ; 
        }

        return count ; 
    }
}