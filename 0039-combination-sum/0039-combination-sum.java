class Solution {
    public void ans(int[] arr , int target , int idx , List<List<Integer>> result , List<Integer> check ) {

        if (target == 0  ) {
            result.add(new ArrayList<>(check)) ;  
            return ; 
        }

        // base case 
        if( idx == arr.length || arr[idx] > target  ) {
            return ; 
        }

        
        ans(arr , target , idx+1 , result , check ) ;
        if ( arr[idx] <= target ) {
            check.add(arr[idx]) ; 
            ans(arr , target - arr[idx] , idx , result , check ) ;
            check.remove(check.size() - 1 ) ;  
        }
         
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates) ;
        List<List<Integer>> result = new ArrayList<>()  ; 
        ans(candidates , target , 0 ,result  , new ArrayList<>() ) ; 
        return result ; 
    }
}