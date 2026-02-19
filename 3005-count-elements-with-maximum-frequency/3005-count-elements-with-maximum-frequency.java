class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101] ; 

        for ( int ele : nums ) {
            freq[ele]++ ; 
        }

        int max = 0 ; 
        int count = 0 ; 

        for ( int ele : freq ) {
            if(ele > max ) max = ele ; 
        }

        for ( int ele : freq ) {
            if(ele == max) count++ ; 
        }

        return count*max ; 
    }
}