class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = [0,0]
        for i , ele in enumerate(nums) :
            for j , ele1 in enumerate(nums) :
                if i != j and ele + ele1 == target :
                    l[0] = i
                    l[1] = j 
        return l                 
