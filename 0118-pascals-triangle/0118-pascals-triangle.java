class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>() ; 
        List<Integer> j = new ArrayList<>() ; 
        j.add(1) ; 
        l.add(new ArrayList<>(j)) ; 

        while ( numRows-- > 1 ) {
            List<Integer> list = new ArrayList<>() ; 
            list.add(1) ; 
            List<Integer> li = l.get(l.size()-1) ;
            for ( int i = 1 ; i < li.size() ; i++ ) {
                list.add(li.get(i) + li.get(i-1)) ; 
            } 
            list.add(1) ; 
            l.add(new ArrayList<>(list)) ; 
        }
        return l ; 
    }
}