class Solution {
    public void findAll(int[] n , int idx , List<Integer> ans , List<List<Integer>> list ){
        if ( n.length == idx ) {
            list.add(new ArrayList(ans));
            return ; 
        }
        
        findAll(n,idx+1,ans,list);
         
        ans.add(n[idx]);
        findAll(n,idx+1,ans,list);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>() ; 
        findAll(nums , 0 , ans , result) ; 
        return result ; 
    }
}