class Solution {
    public int split(String seq ) {
        int maxDepth = 0 ; 
        int currDepth = 0 ; 

        for ( char ch : seq.toCharArray()) {
            if ( ch == '(') {
                currDepth++ ; 
                maxDepth = Math.max(maxDepth , currDepth ) ; 
            }
            else {
                currDepth-- ; 
            }
        }

        return maxDepth/2 ; 
    }
    public int[] maxDepthAfterSplit(String seq) {
        // function to split 
        int len = seq.length() ; 
        int splitIdx = split(seq) ; 

        int[] ans = new int[len] ; 
        int currSpilt = 0 ; 

        for ( int i = 0 ; i < len ; i++ ) {
            char ch = seq.charAt(i) ; 

            // if ( then 
            if ( ch == '(') {
                currSpilt++ ; 
                // if split <= splitIdx then group A
                if ( currSpilt <= splitIdx ) {
                    ans[i] = 0 ; 
                }
                else {
                    ans[i] = 1 ; 
                }
            }
            else {
                currSpilt-- ; 
                if ( currSpilt < splitIdx ) {
                    ans[i] = 0 ; 
                }
                else{
                    ans[i] = 1 ; 
                }
            }
        }
        return ans ; 
    }
}