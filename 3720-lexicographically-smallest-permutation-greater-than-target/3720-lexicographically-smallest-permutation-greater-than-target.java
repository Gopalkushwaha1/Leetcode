class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        int[] freq = new int[26];

        // Characters available in s
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Try changing target from right to left
        for (int i = n - 1; i >= 0; i--) {

            // We want target[0 ... i-1] to remain same.
            // So remove those prefix characters from freq.
            boolean possible = true;

            for (int j = 0; j < i; j++) {
                int idx = target.charAt(j) - 'a';

                if (freq[idx] == 0) {
                    possible = false;
                    break;
                }

                freq[idx]--;
            }

            if (possible) {

                int current = target.charAt(i) - 'a';

                // Find smallest character > target[i]
                for (int c = current + 1; c < 26; c++) {

                    if (freq[c] > 0) {

                        StringBuilder ans = new StringBuilder();

                        // Keep prefix
                        ans.append(target.substring(0, i));

                        // Make it greater
                        ans.append((char) ('a' + c));

                        freq[c]--;

                        // Remaining characters in sorted order
                        for (int j = 0; j < 26; j++) {
                            while (freq[j] > 0) {
                                ans.append((char) ('a' + j));
                                freq[j]--;
                            }
                        }

                        return ans.toString();
                    }
                }
            }

            // Reset freq for next position
            freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
        }

        return "";
    }
}