class Solution {
    public void findAll( int i , int n ,ArrayList<List<Integer>> ans ,ArrayList<Integer> result , int arr[]  ){
        if( i == n ) {
            ans.add(new ArrayList(result));
            return ; 
        }
        result.add(arr[i]) ; 
        findAll(i+1 , n , ans , result , arr) ; 
        result.remove(result.size() - 1);
        findAll(i+1 , n , ans , result , arr) ; 
    }
    public List<List<Integer>> subsets(int[] arr) {
        ArrayList<List<Integer>> ans = new ArrayList<>() ; 
        ArrayList<Integer> result = new ArrayList<>() ; 
        findAll(0,arr.length , ans , result , arr ) ; 
        return ans ;
    }
}