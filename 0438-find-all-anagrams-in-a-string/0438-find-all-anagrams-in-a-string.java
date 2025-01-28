class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int start = 0 , end = Math.min(s.length() , p.length()); 
        int[] ans = new int[26] ; 
        int[] ans2 = new int[26] ; 

        for ( int i = 0 ; i < end ; i++ ) {
            ans[p.charAt(i) - 'a']++ ; 
            ans2[s.charAt(i) - 'a']++ ;
        }
        for ( int i = 0 ; i < ans.length ; i++ ) {
            System.out.println(ans[i] + " " + ans2[i] ) ; 
        }
        List<Integer> result = new ArrayList<>() ;
        if ( p.length() > s.length() ) return result; 
        System.out.println(Arrays.equals(ans,ans2) ) ;
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