class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][] adjmatrix = new long[26][26] ; 

        for ( int i = 0 ; i < 26 ; i++ ) {
            Arrays.fill(adjmatrix[i] , Long.MAX_VALUE) ; 
        }
        for ( int i = 0 ; i < original.length ; i++ ) {
            adjmatrix[original[i]-'a'][changed[i]-'a'] = Math.min(adjmatrix[original[i]-'a'][changed[i]-'a'] , cost[i]*1L) ; 
        }

        // Apply floyeed algo 

        for ( int i = 0 ; i < 26 ; i++ ) {
            for ( int j = 0 ; j < 26 ; j++ ) {
                for ( int k = 0 ; k < 26 ; k++ ) {
                    if(adjmatrix[j][i] != Long.MAX_VALUE && adjmatrix[i][k] != Long.MAX_VALUE ) {
                        adjmatrix[j][k] = Math.min(adjmatrix[j][k] , adjmatrix[j][i] + adjmatrix[i][k]) ; 
                    }
                }
            }
        }

        long ans = 0L ;
        for ( int i = 0 ; i < source.length() ; i++ ) {
            char from = source.charAt(i) ; 
            char to = target.charAt(i) ; 

            if(from == to ) continue ; 

            if(adjmatrix[from-'a'][to-'a'] == Long.MAX_VALUE) return -1 ; 

            ans += adjmatrix[from-'a'][to-'a'] ; 
        } 

        return ans ; 
    }
}