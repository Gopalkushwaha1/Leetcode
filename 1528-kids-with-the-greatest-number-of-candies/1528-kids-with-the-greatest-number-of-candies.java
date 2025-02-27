class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0 ; 
        List<Boolean> list = new ArrayList<>() ; 

        // Calculate max candies 
        for ( int ele : candies ) {
            max = Math.max(max , ele) ; 
        }
        // Update list
        for ( int i = 0 ; i < candies.length ; i++ ) {
            if (extraCandies + candies[i] >= max ) {
                list.add(true) ;
            }
            else {
                list.add(false);
            }
        }
        return list ; 
    }
}