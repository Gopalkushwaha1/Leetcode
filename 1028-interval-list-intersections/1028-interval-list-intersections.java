class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        int i = 0 , j = 0 , start = 0 , end = 0 ; 
        List<int[]> answer = new ArrayList<>();

        while ( i < firstList.length && j < secondList.length ) {

            start = Math.max( firstList[i][0] , secondList[j][0]) ; 
            end = Math.min( firstList[i][1] , secondList[j][1]) ;

            if ( start <= end ) {
                answer.add( new int[]{ start , end });
            }

            if ( firstList[i][1] < secondList[j][1] ) i++ ; 

            else j++ ; 
        }

        return answer.toArray(new int[answer.size()][]);
    }
}