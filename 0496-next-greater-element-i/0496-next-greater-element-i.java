class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums2.length] ; 
        Arrays.fill(ans , -1 ) ; 

        Stack<Integer> st = new Stack<>() ; 

        for ( int i = 0 ; i < nums2.length ; i++ ) {

            while ( !st.isEmpty() && nums2[st.peek()] < nums2[i]) {
                ans[st.peek()] = nums2[i] ; 
                st.pop() ; 
            }
            st.push(i) ; 
        }
        int[] result = new int[nums1.length] ; 

        for ( int i = 0 ; i < nums1.length ; i++ ) {
            for ( int j = 0 ; j < nums2.length ; j++ ) {
                if(nums1[i] == nums2[j]) {
                    result[i] = ans[j] ; 
                    break ; 
                }
            }
        }

        return result ; 
    }
}