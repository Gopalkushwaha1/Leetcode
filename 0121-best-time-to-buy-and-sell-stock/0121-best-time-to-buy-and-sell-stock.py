class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        curr_min = prices[0] 
        ans = 0 

        for i in range(len(prices)) :
             if prices[i] < curr_min :
                curr_min = prices[i] 
             ans = max(ans , prices[i] - curr_min)     

        return ans           