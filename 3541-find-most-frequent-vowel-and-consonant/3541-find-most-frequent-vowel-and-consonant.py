class Solution:
    def maxFreqSum(self, s: str) -> int:
        dict1 = {} 
        dict2 = {}
        maxV = 0 
        maxC = 0 
        for i in s :
            if i in "aeiou" :
                if i in dict1 :
                    dict1[i] += 1  
                else :
                    dict1[i] = 1 
                maxV = max(maxV , dict1[i])
        for i in s :
            if i not in "aeiou" :
                if i in dict2 :
                    dict2[i] += 1 
                else :
                    dict2[i] = 1 
                maxC = max(maxC , dict2[i]) 

        return maxC + maxV                     
