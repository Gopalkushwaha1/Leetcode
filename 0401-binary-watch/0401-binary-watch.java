class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>() ; 

        for ( int i = 0 ; i < 12 ; i++ ) {
            for ( int j = 0 ; j < 60 ; j++ ) {
                if(Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    list.add(i + ":" + (j < 10  ? "0" : "") + j ) ; 
                }
            }
        }
        return list ; 
    }
}