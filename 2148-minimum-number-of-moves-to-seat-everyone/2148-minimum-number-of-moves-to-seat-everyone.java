class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {

        // Sort the both array to find minium moves 
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0 ; 

        // Calculate moves 
        for ( int i = 0 ; i < seats.length ; i++ ) {
            ans += Math.abs(seats[i] - students[i]) ; 
        }

        return ans ; 
    }
}