class Solution {

    private boolean isPermutation(int n, int target) {
        int[] count = new int[10];

        // Count digits of n
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }

        // Subtract digits of target
        while (target > 0) {
            count[target % 10]--;
            target /= 10;
        }

        // Check if all counts are zero
        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }

    public boolean isDigitorialPermutation(int n) {
        return isPermutation(n, 145) || isPermutation(n, 40585) || n <=2 ;
    }
}