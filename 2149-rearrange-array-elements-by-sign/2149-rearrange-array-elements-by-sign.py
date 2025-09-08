class Solution(object):
    def rearrangeArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        pos = 0 
        neg = 1 
        ans = [0] * len(nums) 

        for ele in nums :
            if ele > 0 :
                ans[pos] = ele 
                pos += 2 
            else :
                ans[neg] = ele 
                neg += 2 
        return ans         

        