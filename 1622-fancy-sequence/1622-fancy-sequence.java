class Fancy {
    List<Long> list ; 
    int mod = 1_000_000_007 ;  
    long add ;  // cal for add 
    long mul ;  // for mul 

    public Fancy() {
        list = new ArrayList<>() ; 
        add = 0 ; 
        mul = 1 ; 
    }
    
    public void append(int val) {
        // use formula 
        long v = (val - add ) % mod ; 
        // check 
        if(v < 0 ) v += mod ; 
        // find the inverse 
        v = ( v * modInverse(mul)) % mod ; 
        list.add(v); 
    }
    
    public void addAll(int inc) {
        // update the add 
        add = (add + inc ) % mod ; 
    }
    
    public void multAll(int m) {
        mul = (mul * m ) % mod ; 
        add = (add * m ) % mod ; 
    }
    
    public int getIndex(int idx) {
        if ( idx >= list.size()) return -1 ; 

        long val = list.get(idx) ;  
        // update 
        val = (val * mul) % mod ; 
        val = (val + add ) % mod ; 

        return (int)val ; 
    }
    public long modInverse(long x ) {
        return power(x , mod - 2 ) ; 
    }
    public long power(long base , long exp ) {
        long res = 1 ; 
        base %= mod ; 

        // find 
        while ( exp > 0 ) {
            if((exp & 1 ) == 1 ) {
                res = (res * base ) % mod  ; 
            }
            base = (base * base ) % mod ; 
            exp >>= 1 ;   // right 
        }

        return res ; 
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */