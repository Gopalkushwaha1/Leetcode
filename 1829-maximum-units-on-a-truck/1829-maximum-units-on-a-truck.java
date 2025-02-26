class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a,b) -> Integer.compare(b[1] , a[1])) ;
        int ans = 0 ; 
        int i = 0 ; 

        while (i < boxTypes.length && truckSize > 0 ){
            int unit = boxTypes[i][0] ; 
            int count = boxTypes[i][1] ;
             

            if ( unit <= truckSize) {
                ans += unit * count ; 
                truckSize -= unit ; 
                if ( truckSize <= 0 ) return ans ;
            } 
            else {
                ans += truckSize * count ; 
                return ans ; 
            }
            // System.out.println(unit + " " + count + " " + truckSize + " " + ans) ; 
            i++ ; 
        }
        return ans ; 
    }
}