class Solution {
    static int[] parent ; 
    public int ans(int a ) {
        if(parent[a] == a ) return a ; 
        return ans(parent[a]) ; 
    }
    public void find(int a , int b ) {
        int leaderA = ans(a) ; 
        int leaderB = ans(b) ; 

        if(leaderA != leaderB ) {
            parent[leaderB] = leaderA ; 
        } 
    }
    public int findCircleNum(int[][] isConnected) {
        parent = new int[isConnected.length+1] ; 

        for ( int i = 0 ; i <= isConnected.length ; i++ ) {
            parent[i] = i ; 
        }

        for ( int i =  0 ; i < isConnected.length ; i++ ) {
            for ( int j = 0 ; j < isConnected.length ; j++ ) {
                if( i != j && isConnected[i][j] == 1 ) {
                    find(i+1,j+1) ; 
                }
            }
        }

        int count = 0 ; 

        for ( int i = 1 ; i <= isConnected.length ; i++ ) {
            if(parent[i] == i ) count++ ; 
        }

        return count ; 
    }
}