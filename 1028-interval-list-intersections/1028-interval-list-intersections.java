class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int i = 0 , j = 0 ;   // define variable 

        List<int[]> answer = new ArrayList<>() ; // to store ans 

        while ( i < firstList.length &&  j < secondList.length ) {
            
            int start = Math.max ( firstList[i][0] , secondList[j][0]) ; // take max 
            int end  = Math.min ( firstList[i][1] , secondList[j][1]) ;  // take min

            if ( start <= end ) {

                answer.add(new int[] {start , end }) ;            // update ans 

            } 

            if ( firstList[i][1] < secondList[j][1]) {          // update i 

                i++ ;

            }

            else {                         

                j++ ;                 // update j 

            }

        }

        return answer.toArray(new int[answer.size()][]) ;  // return ans 
    }
}