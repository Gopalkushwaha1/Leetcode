class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] dummyArray = new Integer[arr.length] ; 

        for ( int i = 0 ; i < arr.length ; i++ ) {
            dummyArray[i] = arr[i] ; 
        }
        Arrays.sort(dummyArray , (a,b) -> {
            int prev = Integer.bitCount(a) ; 
            int curr = Integer.bitCount(b) ;

            if ( prev == curr ) return a - b ; 

            return prev - curr ;  
        }) ; 

        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr[i] = dummyArray[i] ; 
        }

        return arr ; 
    }
}