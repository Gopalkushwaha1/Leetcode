class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0 , i = 0 , j = people.length - 1 ;
        Arrays.sort(people) ; 

        while ( i <= j  ) {
            if( people[i] + people[j] <= limit ) {
                i++;
            }
            count++;
            j--;
        } 

        return count ; 
    }
}