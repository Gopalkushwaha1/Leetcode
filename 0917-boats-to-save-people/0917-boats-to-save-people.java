class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0 , j = people.length , count = 0 ;
        Arrays.sort(people) ; 

        while ( i < j ) {
            if(people[i] + people[j-1] <= limit ) {
                count++;
                i++ ; j-- ; 
            }
            else {
                 count++ ;
            j-- ; 
            }
        }
        return count ; 
    }
}