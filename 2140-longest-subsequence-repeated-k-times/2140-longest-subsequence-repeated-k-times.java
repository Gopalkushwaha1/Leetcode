class Solution {

    public String longestSubsequenceRepeatedK(String s, int k) {
        /* ---------- 0. basics ---------- */
        int[] freq = new int[26];                // supply table
        int maxLen = s.length() / k;             // longest possible seq

        for (char ch : s.toCharArray())          // count letters
            freq[ch - 'a']++;

        /* ---------- 1. usable letters, in 'z'..'a' order ---------- */
        List<Character> usable = new ArrayList<>();
        for (int i = 25; i >= 0; i--)            // reverse alphabet
            if (freq[i] >= k)
                usable.add((char) ('a' + i));

        /* ---------- 2. try lengths max → 1 ---------- */
        for (int len = maxLen; len >= 1; len--) {
            String answer = dfs("", usable, len, freq, k, s);
            if (answer != null) return answer;   // first hit is optimal
        }
        return "";                               // nothing worked
    }

    /* --------- depth-first search (lexicographically descending) --------- */
    private String dfs(String cur,
                       List<Character> usable,
                       int targetLen,
                       int[] supply,
                       int k,
                       String s) {

        if (cur.length() == targetLen) {                     // fixed length reached
            return isSubsequence(repeat(cur, k), s) ? cur : null;
        }

        for (char c : usable) {                              // 'z'..'a' order
            String next = cur + c;
            if (!fits(supply, next, k)) continue;            // quick prune
            String res = dfs(next, usable, targetLen, supply, k, s);
            if (res != null) return res;                     // propagate success
        }
        return null;
    }

    /* ---------- helper: supply (frequency) check ---------- */
    private boolean fits(int[] supply, String word, int k) {
        int[] need = new int[26];
        for (char c : word.toCharArray()) need[c - 'a']++;
        for (int i = 0; i < 26; i++)
            if (need[i] * k > supply[i]) return false;
        return true;
    }

    /* ---------- helper: subsequence test ---------- */
    private boolean isSubsequence(String pattern, String text) {
        int j = 0;
        for (int i = 0; i < text.length() && j < pattern.length(); i++)
            if (text.charAt(i) == pattern.charAt(j)) j++;
        return j == pattern.length();
    }

    /* ---------- tiny helper: repeat a string k times ---------- */
    private String repeat(String w, int k) {
        StringBuilder sb = new StringBuilder(w.length() * k);
        for (int i = 0; i < k; i++) sb.append(w);
        return sb.toString();
    }
}
