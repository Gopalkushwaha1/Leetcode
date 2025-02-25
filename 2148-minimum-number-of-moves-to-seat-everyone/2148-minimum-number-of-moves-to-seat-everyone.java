class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       //  Create n size Array to store position in sorted way 
       int[] s1 = new int[101] ;
       int[] s2 = new int[101] ; 

       // Mark the Actual position
       for ( int i = 0 ; i < seats.length ; i++ ) {
            s1[seats[i]]++;
            s2[students[i]]++;
       }
       // Make two varibale to track postion 
       int i = 0 , j = 0 , ans = 0 ; 
       // Calculate ans 
       while ( i < 101 && j < 101 ) {
            while ( i < 101 && s1[i] == 0 ) i++ ; 
            while ( j < 101 && s2[j] == 0 ) j++ ;
            System.out.println(Math.abs(i-j) + " " + i + " " + j ) ;  
            

            ans += Math.abs(i-j);
            if ( i == 101 || j == 101) return ans ; 
            s1[i]--;
            s2[j]--;
            i--; j--; 
       }
       return ans ; 
    }
}