class Solution {
    public void ans(int[] arr , int target , int sum , int idx , List<List<Integer>> result , List<Integer> check ) {
        // base case 
        if( idx == arr.length  ) {
            return ; 
        }

        if ( sum == target ) {
            result.add(new ArrayList<>(check)) ;  
            return ; 
        }

        if ( arr[idx] + sum <= target ) {
            check.add(arr[idx]) ; 
            ans(arr , target , sum + arr[idx] , idx , result , check ) ;
            check.remove(check.size() - 1 ) ;  
        }
        ans(arr , target , sum , idx+1 , result , check ) ; 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates) ;
        List<List<Integer>> result = new ArrayList<>()  ; 
        ans(candidates , target , 0 , 0 ,result  , new ArrayList<>() ) ; 
        return result ; 
    }
}