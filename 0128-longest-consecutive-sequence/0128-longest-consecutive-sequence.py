class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0 :
            return 0 
        maxlen = 1 
        nums.sort() 
        count =  0
        i = 0 
        check = True 
        while i < len(nums) - 1 :
             if nums[i] == nums[i+1] :
                i += 1 
                continue 
             if nums[i] == nums[i+1] - 1 :
                check = False 
                count += 1 
                maxlen = max(maxlen , count)
                i += 1 
                continue 
             count = 0
             i += 1 
        if check :
            return 1      
        return maxlen + 1        
