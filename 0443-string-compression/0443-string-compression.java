class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                str.append(chars[i]);
                if (count > 1) {
                    str.append(count);
                }
                count = 1;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}