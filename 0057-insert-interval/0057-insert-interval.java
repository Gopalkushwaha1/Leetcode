class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>() ; 

        for ( int[] l : intervals) {
            list.add(l) ; 
        }

        list.add(newInterval) ; 

        Collections.sort(list , (a,b) -> Integer.compare(a[0],b[0])) ; 
        int i = 0 ; 
        List<int[]> ans = new ArrayList<>() ; 

        while (i < list.size()) {
            int j = i + 1 ; 
            int range = list.get(i)[1] ; 

            while ( j < list.size() && list.get(j)[0] <= range ) {
                range = Math.max(range , list.get(j)[1]) ; 
                j++ ; 
            }
            ans.add(new int[]{list.get(i)[0] , range}) ; 
            i = j ; 
        }

        return ans.toArray(new int[ans.size()][]) ; 
    }
}