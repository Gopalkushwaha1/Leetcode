class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        countZero = 0 
        countOne = 0 
        countTwo = 0 

        for ele in nums :
            if ele == 0 :
                countZero = countZero + 1 
            if ele == 1 :
                countOne = countOne + 1 
            if ele == 2 :
                countTwo = countTwo + 1 

        i = 0 

        while countZero != 0 :
            nums[i] = 0 
            i = i+1 
            countZero = countZero - 1 
        while countOne != 0 :
            nums[i] = 1 
            i = i+1 
            countOne = countOne - 1 

        while countTwo != 0 :
            nums[i] = 2 
            i = i+1 
            countTwo = countTwo - 1