class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 1 , idx = 0 ; 

        while  ( k > 0 && idx < arr.length ) {
            if ( count == arr[idx] ) idx++ ;
            else k-- ;
            count++ ; 
        }

        return k != 0 ? arr[arr.length - 1 ] + k : count - 1 ; 
    }
}

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int i = 1 ;
//         int idx = 0 ;
//         while ( k > 0 && idx < arr.length ) {
//             if (i == arr[idx]) idx ++ ;
//             else k-- ; 
//             i++ ; 
//         }
//         return k != 0 ? arr[arr.length-1]+k : i-1 ; 
//     }
// }