class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ; 

        for ( int ele : nums ) {
            if(set.contains(ele)) {
                set.remove(ele) ; 
                continue ; 
            }
            set.add(ele) ; 
        }
        return set.iterator().next(); 
    }
}