class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> dp = new HashMap<>();
        
        int max = 1;
        
        for (String word : words) {
            int best = 1;  
            
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                
                if (dp.containsKey(prev)) {
                    best = Math.max(best, dp.get(prev) + 1);
                }
            }
            
            dp.put(word, best);
            max = Math.max(max, best);
        }
        
        return max;
    }
}
