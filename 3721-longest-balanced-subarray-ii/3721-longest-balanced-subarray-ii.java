class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length ; 
        int ansMax = 0 ;
        int check = 0 ; 
        int[] checkOdd = new int[100001] ;  
        int[] checkEven = new int[100001] ; 
        int evenCount = 0 ; 
        int oddCount = 0 ;  

        for ( int i = 0 ; i < n ; i++ ) {
            if(ansMax >= n - i ) break ; 
            check++ ; 
            evenCount = 0 ;
            oddCount = 0 ;
            for ( int j = i ; j < n ; j++ ) {
                int val = nums[j] ; 
                if((val & 1) == 0 ) {
                    if(checkEven[val] != check ) {
                        checkEven[val] = check ; 
                        evenCount++ ; 
                    }
                }
                else {
                    if(checkOdd[val] != check ) {
                        checkOdd[val] = check ; 
                        oddCount++ ; 
                    }
                }
                if(evenCount == oddCount ) ansMax = Math.max(ansMax , j - i + 1 ) ;  
            }
        }
        return ansMax ; 
    }
}