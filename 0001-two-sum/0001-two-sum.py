class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {} 
        L = [0,0]
        for i , ele in enumerate(nums) :
            if target - ele in dict :
                L[0] = i 
                L[1] = dict[target-ele] 
                return L
            dict[ele] = i 
        return L         