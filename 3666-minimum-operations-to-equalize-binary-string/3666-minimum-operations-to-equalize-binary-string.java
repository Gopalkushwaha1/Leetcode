class Solution {
    public int minOperations(String s, int k) {
        // take len and zero count 

        int n = s.length() ; 
        int m = 0 ; // zero count 
        int[] dist = new int[n+1] ; 

        // fill array by infi 
        Arrays.fill(dist , Integer.MAX_VALUE) ; 

        List<TreeSet<Integer>> node = new ArrayList<>() ; 
        node.add(new TreeSet<>()) ; 
        node.add(new TreeSet<>()) ;

        // fill 

        for ( int i = 0 ; i <= n ; i++ ) {
            node.get(i % 2).add(i) ; 
            if( i < n && s.charAt(i) == '0') {
                m++ ;             // count zero 
            }
        } 

        // create queue for BFS 
        Queue<Integer> q = new ArrayDeque<>() ; 
        q.offer(m) ;           // add first zero count 

        dist[m] = 0 ; 
        node.get(m%2).remove(m) ;

        // apply BFS 

        while ( !q.isEmpty() ) {
            m = q.poll() ; 
            int max = Math.max(k-n+m , 0 ) ; 
            int min = Math.min(m,k) ; 

            int lnode = m+k-2 * min ; 
            int rnode = m+k-2 * max ;

            TreeSet<Integer> nodeSet = node.get(lnode%2) ; 

            for ( Integer m2 = nodeSet.ceiling(lnode) ; 
            m2 != null && m2 <= rnode ; 
            m2 = nodeSet.ceiling(lnode) 
            ) {
                dist[m2] = dist[m] + 1 ; 
                q.offer(m2) ; 
                nodeSet.remove(m2) ; 
            } 
        } 
        return dist[0] == Integer.MAX_VALUE ? -1 : dist[0] ; 
    }
}