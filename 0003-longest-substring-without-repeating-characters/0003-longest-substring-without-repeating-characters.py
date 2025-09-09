class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        i = 0 
        j = 0 
        max_len = 0 
        dict1 = {}

        while j < len(s) :
            chars = s[j] 
            dict1[chars] = dict1.get(chars,0) + 1 

            while dict1[chars] > 1 :
                ch = s[i] 
                dict1[ch] = dict1[ch] - 1 
                i += 1 

            max_len = max(max_len , j - i + 1 )   
            j += 1  

        return max_len           
