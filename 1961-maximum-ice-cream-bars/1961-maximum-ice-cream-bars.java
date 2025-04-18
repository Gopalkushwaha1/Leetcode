class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs) ; 
        if(costs[0] > coins ) return 0 ; 
        for ( int i = 1 ; i < costs.length ; i++ ) {
            System.out.print(costs[i] + " ") ; 
            costs[i] += costs[i-1] ; 
            if(costs[i] > coins ) return i ; 
        }
        return costs.length ; 
    }
}