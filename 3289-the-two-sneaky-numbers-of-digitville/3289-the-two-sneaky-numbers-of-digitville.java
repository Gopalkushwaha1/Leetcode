class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>() ; 
        List<Integer> list = new ArrayList<>() ; 

        for ( int ele : nums ) {
            if(set.contains(ele)) {
                list.add(ele) ; 
                continue ; 
            }
            set.add(ele) ; 
        }

        int[] ans = new int[2] ; 
        ans[0] = list.get(0) ; 
        ans[1] = list.get(1) ; 

        return ans ; 
    }
}