class Solution {
    public boolean isValid(int[] bloomDay , int m , int k , int day ) {
        int flower = 0 ; 
        int bouquet = 0 ; 

        for ( int i = 0 ; i < bloomDay.length ; i++ ) {
            if(bloomDay[i] <= day ) {
                flower++ ; 
                if(flower == k ) {
                    bouquet++;
                    flower = 0 ; 
                }
            }
            else {
                flower = 0 ; 
            }
        }

        return bouquet >= m ; 

    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1 ; 
        int min = Integer.MAX_VALUE ; 
        int max = Integer.MIN_VALUE ;

        // Find the min and max 
        for ( int ele : bloomDay ) {
            min = Math.min(ele , min ) ;
            max = Math.max(ele , max ) ;
        } 

        //  validation check
        while ( min <= max ) {
            int mid = (max+min)/2 ; 

            if(isValid(bloomDay , m , k , mid )) {
                max = mid - 1 ; 
            }
            else {
                min = mid + 1 ; 
            }

        }
        return min ; 
    }
}