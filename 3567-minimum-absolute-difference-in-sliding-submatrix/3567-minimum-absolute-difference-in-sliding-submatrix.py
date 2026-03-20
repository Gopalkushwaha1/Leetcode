from typing import List

class Solution:
    def minAbsDiff(self, grid: List[List[int]], k: int) -> List[List[int]]:
        n = len(grid)
        m = len(grid[0])

        ans = [[0]*(m-k+1) for _ in range(n-k+1)]

        for i in range(n - k + 1):
            for j in range(m - k + 1):
                s = set()

                # collect elements in k x k submatrix
                for x in range(i, i + k):
                    for y in range(j, j + k):
                        s.add(grid[x][y])

                lst = sorted(s)   # convert + sort
                mini = float('inf')

                # find min difference
                for t in range(1, len(lst)):
                    mini = min(mini, lst[t] - lst[t-1])

                ans[i][j] = 0 if mini == float('inf') else mini

        return ans