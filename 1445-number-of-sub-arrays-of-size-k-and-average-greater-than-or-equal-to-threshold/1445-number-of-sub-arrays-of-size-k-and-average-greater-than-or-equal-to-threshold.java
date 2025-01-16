class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // if(arr.length < threshold) return 0 ;  
        int start = 0 ; 
        int end = 0 ; 
        int count = 0 ; 
        int sum = 0 ; 
        for ( end = 0 ; end < k ; end++ ) {
            System.out.print(6);
            sum += arr[end] ; 
        }

        while ( end < arr.length ) {  
            if ( (sum/k) >= threshold) {
                System.out.print(7);
                count++;
            }
            
            sum += arr[end] ; 
            sum -= arr[start];
            start++;
            end++;
        }
        if ( (sum/k) >= threshold) {
                count++;
            }
        return count ; 
    }
}