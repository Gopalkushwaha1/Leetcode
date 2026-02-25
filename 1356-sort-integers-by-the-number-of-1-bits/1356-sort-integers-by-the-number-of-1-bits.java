class Solution {
    public void swap(int[] arr , int minIdx , int i ) {
        int temp = arr[i] ; 
        arr[i] = arr[minIdx] ; 
        arr[minIdx] = temp ; 
    }
    public int[] sortByBits(int[] arr) {
        // Any sorting algo 

        // selection sort 

        for ( int i = 0 ; i < arr.length ; i++ ) {
            int minIdx = i ; 

            for ( int j = i + 1 ; j < arr.length ; j++ ) {

                // check the curr ele bit is less than prev ele bit ; 
                int currBit = Integer.bitCount(arr[j]) ; 
                int prevBit = Integer.bitCount(arr[minIdx]) ; 

                // compare 
                if(currBit < prevBit) {
                    minIdx = j ; 
                }
                if(currBit == prevBit ) {
                    if(arr[j] < arr[minIdx]) {
                        minIdx = j ; 
                    }
                }
            }
            // swap 
            swap(arr , i , minIdx ) ; 
        }

        // return arr
        return arr ; 
    }
}