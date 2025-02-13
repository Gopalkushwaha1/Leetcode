class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>() ; 
        int operation = 0 ; 
        // Add ele in queue 
        for ( int ele : nums ) {
            long a = ele ; 
            pq.add(a) ; 
        } 
        // modify nums to all ele grater than or equal to k 
        while (pq.size() > 1 && pq.peek() < k   ) {
            long ele1 = pq.poll() ; 
            operation++ ; 
            long ele2 = pq.poll() ; 
            long sum = Math.min(ele1 , ele2 ) * 2 + Math.max(ele1 , ele2) ; 
            pq.add(sum) ;  
        }
        return operation ; 
    }
}