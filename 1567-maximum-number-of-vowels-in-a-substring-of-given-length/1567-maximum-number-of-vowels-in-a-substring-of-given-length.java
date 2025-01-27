class Solution {
    // Helper function to check if a character is a vowel
    public boolean isVowel(char c) {
        // Check if the character is one of the vowels (lowercase)
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        // Initialize the sliding window pointers and counters
        int start = 0, end = 0, count = 0, maxCount = 0;

        // Process the first `k` characters in the string
        while (end < k) {
            // Increment count if the current character is a vowel
            if (isVowel(s.charAt(end))) {
                count++;
            }
            end++;
        }

        // Update the maximum count of vowels for the first window
        maxCount = Math.max(count, maxCount);

        // Slide the window through the rest of the string
        while (end < s.length()) {
            // Add the next character to the window
            if (isVowel(s.charAt(end))) {
                count++;
            }
            // Remove the first character of the previous window
            if (isVowel(s.charAt(start))) {
                count--;
            }

            // Update the maximum count of vowels for the current window
            maxCount = Math.max(count, maxCount);

            // Slide the window: move both `start` and `end` pointers
            end++;
            start++;
        }

        // Return the maximum count of vowels found in any window of size `k`
        return maxCount;
    }
}
