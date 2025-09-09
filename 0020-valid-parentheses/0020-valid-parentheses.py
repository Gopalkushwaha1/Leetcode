class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = [] 

        dict1 = { '(' : ')' , 
            '{' : '}' ,
            '[' : ']'}


        s = list(s) 

        for i in range(len(s)) :
            if s[i] in dict1.keys() :
                stack.append(s[i]) 
            else :
                if not stack :
                    return False 
                ch = stack[-1]
                if s[i] != dict1[ch] :
                    return False 
                else :
                    stack.pop()

        if len(stack) >= 1 :
            return False 

        return True 