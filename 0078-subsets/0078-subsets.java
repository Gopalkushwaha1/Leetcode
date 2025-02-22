class Solution {
    public void findSubset(List<List<Integer>> list ,List<Integer> ans, int idx,int[] nums ){
        if ( idx == nums.length ) {
            list.add(new ArrayList(ans)) ;
            return ; 
        }
        
        findSubset(list,ans,idx+1,nums);
        ans.add(nums[idx]) ;
        findSubset(list,ans,idx+1,nums);
        ans.remove(ans.size() - 1 );
        

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>() ; 
        List<Integer> ans = new ArrayList<>() ; 
        findSubset(list,ans,0,nums);
        return list ; 
    }
}