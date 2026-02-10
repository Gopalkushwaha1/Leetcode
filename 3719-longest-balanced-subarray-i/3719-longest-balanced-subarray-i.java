class Solution {
    public int longestBalanced(int[] nums) {
       int ans = 0 ; 
       int[] seenOdd = new int[100001] ;
       int[] seenEven = new int[100001] ;
       int track = 0 ; 
       for ( int i = 0 ; i < nums.length ; i++ ) {
            if(ans >= nums.length - i ) break ; 
            track++ ; 
            int even = 0 ; 
            int odd = 0 ; 
         for ( int j = i ; j < nums.length ; j++ ) {
                int val = nums[j] ; 

                if((val & 1) == 1 ) {
                    if(seenEven[val] != track ) {
                        seenEven[val] = track ; 
                        even++ ; 
                    }
                }    
                else {
                    if(seenOdd[val] != track ) {
                        seenOdd[val] = track ; 
                        odd++ ; 
                    }
                }
                if(even == odd ) ans = Math.max(ans , j - i + 1 ) ;  
            }
       } 
       return ans ; 
    }
}