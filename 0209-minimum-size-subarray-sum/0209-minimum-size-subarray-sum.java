class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        while(j<nums.length){
            target-=nums[j];
        while(target<=0){
            minLength=Math.min(minLength, j-i+1);
            target+=nums[i];
            i++;
        }
        j++;
    }
    if(minLength==Integer.MAX_VALUE) return 0;
    return minLength;
    }
}