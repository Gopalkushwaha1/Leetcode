class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int target, int idx, 
                           List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            // skip duplicates at the same recursion depth
            if (i > idx && arr[i] == arr[i - 1]) continue;

            // pruning: if arr[i] > target, everything afterward is also too large
            if (arr[i] > target) break;

            current.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
