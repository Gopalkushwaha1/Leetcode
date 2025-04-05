class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length , gasSum = 0 , costSum = 0 , totalSum = 0 , idx = 0 ; 

        for ( int ele : gas ) {
            gasSum += ele ; 
        }

        for ( int ele : cost ) {
            costSum += ele ; 
        }

        if ( gasSum < costSum ) return -1 ; 

        for ( int i = 0 ; i < n ; i++ ) {
            totalSum += gas[i] - cost[i] ; 
            if(totalSum < 0 ){
                idx = i + 1 ; 
                totalSum = 0 ; 
            }
        }
        return idx ; 
    }
}