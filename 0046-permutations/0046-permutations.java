class Solution {
    public void per(List<List<Integer>> list , List<Integer> arr , int[] nums){
        if(arr.size() == nums.length){
            list.add(new ArrayList<>(arr));
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(arr.contains(nums[i]))continue;
            arr.add(nums[i]);
            per(list , arr , nums);
            arr.remove(arr.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        per(list , new ArrayList<>() , nums);
        return list;
    }
}