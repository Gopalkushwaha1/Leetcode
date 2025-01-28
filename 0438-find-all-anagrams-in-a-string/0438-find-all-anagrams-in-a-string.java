class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>() ;
        if ( p.length() > s.length() ) return result;
        int start = 0 ; 
        int[] ans = new int[26] ; 
        int[] ans2 = new int[26] ; 

        for ( int i = 0 ; i < p.length() ; i++ ) {
            ans[p.charAt(i) - 'a']++ ; 
            ans2[s.charAt(i) - 'a']++ ;
        } 
        if(Arrays.equals(ans,ans2)) result.add(0); 
        for( int i = p.length() ; i < s.length() ; i++ ) {
            ans2[s.charAt(i) - 'a']++;
            ans2[s.charAt(start) - 'a']-- ;
            start++;
            if(Arrays.equals(ans,ans2)) result.add(start);
        }
        return result ; 
    }
}