class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list = new ArrayList<>() ; 
        list.add(nums[0]*1L ) ; 

        int i = 1 ; 

        while ( i < nums.length ) {
            list.add((long)nums[i]) ; 
            while ( list.size() > 1 && list.get(list.size()-1).equals(list.get(list.size() - 2))) {
                long a = list.remove(list.size()-1) ; 
                long b = list.remove(list.size()-1) ; 
                list.add(a+b) ; 
            }
            i++ ; 
        }
        return list ; 
    }
}


