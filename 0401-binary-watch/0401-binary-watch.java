class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>() ; 

        // hr 0 ..... 12 
        for ( int hr = 0 ; hr < 12 ; hr++ ) {
            // min 0 ......... 60 
            for ( int min = 0 ; min < 60 ; min++ ) {
                // check curr hour bit + curr min bit == turnOn 
                if(Integer.bitCount(hr) + Integer.bitCount(min) == turnedOn) {
                    ans.add(hr + ":" + (min < 10 ? "0" : "" ) + min ) ; 
                }
            }
        }
        return ans ; 

        // min < 10                  0 add then min
        // min add
    }
}