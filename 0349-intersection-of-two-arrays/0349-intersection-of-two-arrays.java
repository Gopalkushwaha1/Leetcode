class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>() ; 

        for ( int ele : nums1 ) {
            set.add(ele) ; 
        }

        List<Integer> list = new ArrayList<>() ; 
        for ( int ele : nums2 ) {
            if ( set.contains(ele)) {
                list.add(ele) ; 
                set.remove(ele) ; 
            }
        }
        int[] ans = new int[list.size()] ; 
        for ( int i = 0 ; i < list.size() ; i++ ){
            ans[i] = list.get(i) ; 
        } 

        return ans ; 
     }
}