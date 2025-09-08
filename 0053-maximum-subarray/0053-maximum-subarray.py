class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curr_sum = 0 
        max_sum = float('-inf')

        for i , ele in enumerate(nums) :
            curr_sum += ele 

            if curr_sum <= 0 :
                max_sum = max(max_sum,ele) 
                curr_sum = 0 
            else : 
                max_sum = max(max_sum , curr_sum) 

        return max_sum ;          