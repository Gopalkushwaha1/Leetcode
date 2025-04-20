class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26] ; 

        for ( char ch : s.toCharArray()) {
            arr[ch-'a']++ ; 
        }

        HashSet<Integer> set = new HashSet<>() ; 
        int ans = 0 ; 
        for ( int ele : arr ) {
            while ( ele > 0 && set.contains(ele)){
                ans++ ; 
                ele-- ; 
            }
            set.add(ele) ; 
        }
        return ans ; 
    }
}