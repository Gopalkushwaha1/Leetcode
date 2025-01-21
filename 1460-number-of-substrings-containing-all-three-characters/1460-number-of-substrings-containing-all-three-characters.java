class Solution {
    public int numberOfSubstrings(String s) {
        int a = 0 , b = 0 , c = 0 ;
        int start = 0 , end = 0 , count = 0 ;  

        while ( end < s.length()) {  

            if(s.charAt(end) == 'a')a++;

            else if(s.charAt(end) == 'b')b++;

            else c++ ;   
                                     
            while(a >= 1 && b >= 1 && c >= 1 ) { 

                count += (s.length() - end  ) ;   

                if(s.charAt(start) == 'a')a--;

                else if(s.charAt(start) == 'b')b--;

                else c--;     

                start++;                                  
            }
            end++ ;                                       
        }
        return count ;                                   
    }
}