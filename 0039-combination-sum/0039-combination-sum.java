class Solution {
    public void ans(int[] arr , int target , int sum , int idx , List<List<Integer>> result , List<Integer> check ) {
        // base case 
        if( idx == arr.length ) {
            return ; 
        }

        if ( sum == target ) {
            result.add(check) ; 
            return ; 
        }

        if ( arr[idx] + sum <= target ) {
            ans(arr , target , sum , idx+1 , result , check ) ; 
            List<Integer> list = new ArrayList<>(check) ; 
            list.add(arr[idx]) ; 
            ans(arr , target , sum + arr[idx] , idx , result , list ) ; 
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates) ;
        List<List<Integer>> result = new ArrayList<>()  ; 
        ans(candidates , target , 0 , 0 ,result  , new ArrayList<>() ) ; 
        return result ; 
    }
}