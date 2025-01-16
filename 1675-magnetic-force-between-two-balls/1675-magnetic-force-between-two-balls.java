class Solution {
    public boolean isValid ( int mid , int[] position , int m  ) {
        m--;
        int pos = position[0] ; 
        for ( int i = 0 ; i < position.length ; i++ ) {
            if ( position[i] - pos >= mid ) {
                m--;
                pos = position[i];
            }
            if ( m <= 0 ) return true ;
        }
        return false ;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min = 1 ;
        int max = position[position.length - 1] ;

        while ( min <= max ) {
            int mid = (min + max ) / 2 ;
            if ( isValid ( mid , position , m )) min = mid + 1 ;
            else max = mid - 1 ;
        }
        return max ; 
    }
}