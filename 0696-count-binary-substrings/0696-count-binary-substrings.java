class Solution {
    public int countBinarySubstrings(String s) {
        int prevCount = 0;
        int count = 0;
        char prevChar = s.charAt(0);
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (c == prevChar) {
                count++;
            } else {
                prevChar = c;
                sum += Math.min(count, prevCount);
                prevCount = count;
                count = 1;
            }
        }

        return sum + Math.min(count, prevCount);
    }
}