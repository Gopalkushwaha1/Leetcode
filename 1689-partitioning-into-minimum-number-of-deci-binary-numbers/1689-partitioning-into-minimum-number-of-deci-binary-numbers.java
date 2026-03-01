class Solution {
    public int minPartitions(String n) {
        // max to store ans 
        int max = 0 ; 

        // travel 0 ....... n find max 

        for ( char ch : n.toCharArray()) {
            int num = ch-'0' ; 
            max = Math.max(num , max ) ; 
        }

        return max ; 
    }
}