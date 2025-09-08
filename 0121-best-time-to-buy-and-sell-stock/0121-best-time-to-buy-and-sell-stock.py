class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        curr_min = prices[0] 
        curr_max = prices[0] 

        ans = 0 

        for i in range(1,len(prices)) :
            if prices[i] < curr_min :
                curr_min = prices[i]
                curr_max = prices[i] 
            if prices[i] > curr_max :
                ans = max(ans , prices[i] - curr_min) 
                curr_max = prices[i] 

        return ans           