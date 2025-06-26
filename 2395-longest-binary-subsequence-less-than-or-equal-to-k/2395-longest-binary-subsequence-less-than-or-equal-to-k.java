class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        long value = 0;     
        long power = 1;     
        int count = 0;      

        for (int i = n - 1; i >= 0; --i) {
            char c = s.charAt(i);

            if (c == '0') {
                count++;
            } else {
                if (power <= k && value + power <= k) {
                    value += power;
                    count++;
                }
            }
            if (power <= k) {
                power <<= 1;     
            }
        }
        return count;
    }
}
