class Solution {
    public String fractionToDecimal(int n1, int d1) {

        StringBuilder sb = new StringBuilder() ;
        if(n1 == 0 ) {
            sb.append("0");
            return sb.toString() ; 
        }
        HashMap<Long,Integer> map = new HashMap<>() ; 
        boolean a=n1<0;
        boolean b=d1<0;
        if((a^b)) sb.append("-");
        long n = Math.abs((long)n1) ; 
        long d = Math.abs((long)d1) ; 
        
        long ans = n/d ; 
        sb.append(ans) ; 
        if ( n % d == 0 ) return sb.toString() ; 
        sb.append(".") ; 
        while ( n % d != 0 ) {
            long rem = n % d ; 
            if(map.containsKey(rem)) {
                sb.insert(map.get(rem) , "(");
                sb.append(")") ; 
                return sb.toString() ; 
            }
            map.put(rem , sb.length()) ; 
            rem *=10;
            sb.append(Math.abs(rem/d));
            n = rem ; 
        }  


        return sb.toString() ; 
    }
}