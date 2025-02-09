class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        
        for ( int i = 0 ; i < digits.length ; i++ ) {
            if ( map.containsKey(digits[i])) {
                int freq = map.get(digits[i]) ; 
                map.put(digits[i] , freq + 1 ) ; 
            }
            else {
                map.put(digits[i] , 1 ) ; 
            }
        }
        ArrayList<Integer> list = new ArrayList<>() ; 
        for ( int i = 100 ; i <= 999 ; i += 2 ) {
            int x = i ; 
            int a = x%10 ;  x = x/10 ; 
            int b = x%10 ; x = x/10 ; 
            int c = x ; 

            if ( map.containsKey(a)) {
                int freq = map.get(a) ; 
                map.put(a , freq-1) ; 
                if ( freq == 1 ) map.remove(a) ; 
                if(map.containsKey(b)) {
                    int freq2 = map.get(b) ; 
                    map.put(b , freq2-1) ; 
                    if ( freq2 == 1 ) map.remove(b) ; 
                    if ( map.containsKey(c)) {
                        list.add(i) ; 
                    }
                    map.put(b , freq2) ; 
                }
                map.put(a , freq) ; 
            }
        }
        int[] ans = new int[list.size()] ; 

        for ( int i = 0 ; i < list.size() ; i++ ) {
            ans[i] = list.get(i) ; 
        } 
        return ans ; 
    }
}