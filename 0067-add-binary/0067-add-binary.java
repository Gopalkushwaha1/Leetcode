class Solution {
    public String addBinary(String a, String b) {

        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        boolean carry = false;

        StringBuilder sb = new StringBuilder();

        // process while both strings have characters
        while (aLen >= 0 || bLen >= 0) {

            int sum = carry ? 1 : 0;

            if (aLen >= 0) {
                sum += a.charAt(aLen--) - '0';
            }

            if (bLen >= 0) {
                sum += b.charAt(bLen--) - '0';
            }

            sb.append(sum % 2);
            carry = sum >= 2;
        }

        // if carry remains
        if (carry) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
