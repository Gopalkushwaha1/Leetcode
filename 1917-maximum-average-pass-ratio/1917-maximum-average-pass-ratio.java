class Solution {
    class Pair {
        double gain ; 
        int idx ; 
        Pair(double gain , int idx ) {
            this.gain = gain ; 
            this.idx = idx ;
        }
    }
    public double maxAverageRatio(int[][] arr, int extra) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.gain,a.gain)) ; 

        for ( int i = 0 ; i < arr.length ; i++ ) {
                double localmax1 = (double)arr[i][0]/(double)arr[i][1] ; 
                double localmax2 = (double)(arr[i][0] + 1 ) /(double) (arr[i][1] + 1) ; 
                double localmax3 = localmax2 - localmax1 ;  
                pq.add(new Pair(localmax3 , i)) ; 
            }

        while ( extra-- != 0 ) {
            Pair p = pq.poll() ; 

            int idx = p.idx ; 
            arr[idx][0]++;
            arr[idx][1]++;

            double localmax1 = (double)arr[idx][0] / arr[idx][1];
            double localmax2 = (double)(arr[idx][0] + 1) / (arr[idx][1] + 1);
            double gain = localmax2 - localmax1;
            
            pq.add(new Pair(gain, idx));
            
        }

        double ans = 0 ; 
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i][0] + " " + arr[i][1] + " " + ans) ; 
            ans += ((double)arr[i][0]/(double)arr[i][1]) ; 
        }

        return ans/arr.length ; 
    }
}