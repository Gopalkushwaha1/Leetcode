class Solution {
    public int arrayPairSum(int[] nums) {
        int[] count = new int[20001]; // For values in range [-10^4, 10^4]
        
        // Offset by 10,000 to handle negative values
        for (int num : nums) {
            count[num + 10000]++;
        }

        int ans = 0;
        boolean add = true;

        // Traverse the frequency array
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (add) {
                    ans += i - 10000; // Shift back the offset
                }
                add = !add; // Toggle add for pairs
                count[i]--;
            }
        }
        
        return ans;
    }
}
