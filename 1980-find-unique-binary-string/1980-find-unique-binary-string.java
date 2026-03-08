class Solution {
    static String ans ; 
    public void find(int n , StringBuilder sb , HashSet<String> set) {

        // if ans change the stop 
        if(ans.length() != 0 ) return ; 

        // n == sb.length()  the check in hashset 
        if(n == sb.length()) {
            // if not found in HashSet ans mil gya 
            if(! set.contains(sb.toString())) {
                ans = sb.toString() ; 
            }
            return ; 
        }

        // add 1 and call 
        sb.append("1") ; 
        find(n , sb , set ) ; 
        sb.deleteCharAt(sb.length()-1) ;   // backtrack 

        // add 0 and call 
        sb.append("0") ; 
        find(n ,sb , set) ; 
        sb.deleteCharAt(sb.length() - 1 ) ; 
    }
    public String findDifferentBinaryString(String[] nums) {
        ans = "" ; 
        StringBuilder sb = new StringBuilder() ;      // to generate all string
        HashSet<String> set = new HashSet<>() ; 

        // fill hashset
        for ( String s : nums ) {
            set.add(s) ; 
        }

        // find unique that not present in nums 
        find(nums.length , sb , set ) ; 
        return ans ; 
    }
}