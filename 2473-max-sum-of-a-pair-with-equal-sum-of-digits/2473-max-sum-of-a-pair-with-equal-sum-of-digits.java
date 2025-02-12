class Solution {
    public int sumDigit(int ele ) {
        int sum = 0 ; 
        while ( ele != 0 ) {
            sum += ele%10 ; 
            ele /= 10 ; 
        }
        return sum ; 
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer , PriorityQueue<Integer>> map = new HashMap<>() ; 

        // Travel each number in nums 
        for ( int ele : nums ) {
            // Calculate sum of that ele 
            int sum = sumDigit(ele) ; 
            // Put in map 
            if ( map.containsKey(sum)) {
                map.get(sum).add(ele) ; 
            }
            else {
                map.put(sum , new PriorityQueue(Collections.reverseOrder()));
                map.get(sum).add(ele) ; 
            }
        }

        int max = - 1 ; 
        // Get max value 
        for (Map.Entry<Integer , PriorityQueue<Integer>> entry : map.entrySet() ){
             PriorityQueue<Integer> pq = new PriorityQueue<>(entry.getValue()); // Copy to avoid modifying original

            if (pq.size() > 1) {
                int first = pq.poll();  // Get the largest element
                int second = pq.poll(); // Get the second largest element
                max = Math.max( max , first + second ) ; 
            }
        }
        return max ; 
    }
}