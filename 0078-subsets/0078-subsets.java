class Solution {
    public void findAll(int[] n , int idx , List<Integer> ans , List<List<Integer>> list ){
        if ( n.length == idx ) {
            return ; 
        }
        ans.add(n[idx]);
        findAll(n,idx+1,ans,list);
        list.add(new ArrayList(ans));
        ans.remove(ans.size()-1);
        findAll(n,idx+1,ans,list);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList());
        List<Integer> ans = new ArrayList<>() ; 
        findAll(nums , 0 , ans , result) ; 
        return result ; 
    }
}