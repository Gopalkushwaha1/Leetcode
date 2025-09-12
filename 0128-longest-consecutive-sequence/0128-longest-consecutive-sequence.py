class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        if len(nums) == 0 :
            return 0 
        maxcount = 1 
        i = 0 

        for i in s:
            ele=i
            if ele-1 in s:
                continue
            count=1
            while ele+1 in s:
                count +=1
                ele+=1
            maxcount=max(maxcount,count)

        return maxcount            
