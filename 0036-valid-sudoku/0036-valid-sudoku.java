class Solution {
    public boolean isValid2(int s , char[][] board ) {
        HashSet<Character> set = new HashSet<>() ; 
        for ( int i = 0 ; i < 9 ; i++ ) {
            char ch = board[s][i] ; 
            if ( ch == '.') continue ; 
            if(set.contains(ch)) return false ; 
            set.add(board[s][i]) ;  
        }
        return true ; 
    }
    public boolean isValid(int s ,char[][] board ) {
        HashSet<Character> set = new HashSet<>() ; 
        for ( int i = 0 ; i < 9 ; i++ ) {
            char ch = board[i][s] ; 
            if ( ch == '.') continue ; 
            if(set.contains(ch)) return false ; 
            set.add(board[i][s]) ;  
        }
        return true ; 
    }
    public boolean isValidSudoku(char[][] board) {
        boolean check = true ; 
        for ( int i = 0 ; i < 9 ; i++ ) {
            check =  isValid(i,board) ;   // col
            if ( !check ) return false ;
            check = isValid2(i,board) ;   // row 
            if ( !check ) return false ; 
        }

        HashSet<Character> set = new HashSet<>() ; 
        for ( int i = 0 ; i <= 2 ; i++ ) {
            for ( int j = 0 ; j <= 2 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set.contains(board[i][j])) return false ; 
                set.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set2 = new HashSet<>() ; 
        for ( int i = 0 ; i <= 2 ; i++ ) {
            for ( int j = 3 ; j <= 5 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set2.contains(board[i][j])) return false ; 
                set2.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set3 = new HashSet<>() ; 
        for ( int i = 0 ; i <= 2 ; i++ ) {
            for ( int j = 6 ; j <= 8 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set3.contains(board[i][j])) return false ; 
                set3.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set4 = new HashSet<>() ; 
        for ( int i = 3 ; i <=5 ; i++ ) {
            for ( int j = 0 ; j <= 2 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set4.contains(board[i][j])) return false ; 
                set4.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set5 = new HashSet<>() ; 
        for ( int i = 3 ; i <= 5 ; i++ ) {
            for ( int j = 3 ; j <= 5 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set5.contains(board[i][j])) return false ; 
                set5.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set6 = new HashSet<>() ; 
        for ( int i = 3 ; i <= 5 ; i++ ) {
            for ( int j = 6 ; j <= 8 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set6.contains(board[i][j])) return false ; 
                set6.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set7 = new HashSet<>() ; 
        for ( int i = 6 ; i <= 8 ; i++ ) {
            for ( int j = 0 ; j <= 2 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set7.contains(board[i][j])) return false ; 
                set7.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set8 = new HashSet<>() ; 
        for ( int i = 6 ; i <= 8 ; i++ ) {
            for ( int j = 3 ; j <= 5 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set8.contains(board[i][j])) return false ; 
                set8.add(board[i][j]) ; 
            }
        }

        HashSet<Character> set9 = new HashSet<>() ; 
        for ( int i = 6 ; i <= 8 ; i++ ) {
            for ( int j = 6 ; j <= 8 ; j++ ) {
                if(board[i][j] == '.') continue ; 
                if(set9.contains(board[i][j])) return false ; 
                set9.add(board[i][j]) ; 
            }
        }

        return true ; 
    }
}