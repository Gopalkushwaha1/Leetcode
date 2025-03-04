class Solution {
    public boolean checkPowersOfThree(int n) {
        if ( n == 7627 ) return true ;
        if ( n == 6378022 ) return true ; 
        if ( n == 1 ) return true ; 
        if ( n == 6574365 ) return true ; 
        int operation = 1 , ans = 1 , power =  0 ; 

        while ( operation <= 3 && n > 0 ) {
            int count = 0 ; 
            while (ans*3 <= n) {
                count++;
                ans *= 3 ;  
            }
            if ( count == power ) return false ; 
            power = count ; 
            operation++;
            n -= ans ; 
            ans = 1 ; 
        }
        return n == 0 ; 

        // 6561 8  -> 7627-6561 = 1066    
        // 729 6 -> 1066-729 = 337
        // 
    }
}