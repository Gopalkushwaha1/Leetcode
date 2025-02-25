class Solution {
    public String sortSentence(String s) {
        String[] split = s.split(" ") ; 
        String[] res = new String[split.length] ; 
        StringBuilder sb = new StringBuilder() ; 

        for ( int i = 0 ; i < split.length ; i++ ) {
            String str = split[i] ; 
            int idx = (int) (str.charAt(str.length() - 1 ) - '0') ; 
            res[idx-1] = str.substring(0,str.length() - 1 ) ; 
        }

        for ( int i = 0 ; i < res.length-1 ; i++ ) {
            sb.append(res[i] + " ");
        }
        sb.append(res[res.length - 1]) ; 

        return sb.toString() ; 
    }
}