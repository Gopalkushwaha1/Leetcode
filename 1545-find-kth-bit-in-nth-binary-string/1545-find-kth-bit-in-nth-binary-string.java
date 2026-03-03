class Solution {
    public char ans(int n , int k ) {
        // base case 
        if(n == 1 ) return '0' ; 

        // find total len
        int totalLen = (1<<n) - 1 ; 
        int mid = (totalLen/2) + 1 ; 

        // if mid == k return 1 
        if(mid == k ) return '1' ; 

        // k < mid -> go left side 
        if(k < mid ) {
            return ans(n-1 , k ) ; 
        }

        // find new k
        int newLen = totalLen - k + 1 ; 
        char ch = ans(n-1 , newLen ) ; 

        // invert 
        return ch == '0' ? '1' : '0' ; 
    }
    public char findKthBit(int n, int k) {
        return ans(n , k ) ; 
    }
}