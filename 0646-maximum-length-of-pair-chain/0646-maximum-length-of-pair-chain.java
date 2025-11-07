class Solution {
    public int findLongestChain(int[][] pairs) {
        int len = pairs.length ; 

        // Arrays.sort(pairs , (a,b) -> {
        //     if( a[0] == b[0] ) 
        //         return b[0] - a[0] ;
        //     return a[1] - b[1] ;     
        // });

        Arrays.sort(pairs,new Comparator<int[]>(){
        public int compare(int[] a,int[] b){
            return a[1]-b[1];
        }
      } );

        int val = pairs[0][1] ; 
        int count = 1 ; 

        for ( int i = 1 ; i < len ; i++ ) {

            if( pairs[i][0] > val ) {
                count++ ; 
                val = pairs[i][1] ; 
            }
        }
        return count ; 
    }
}