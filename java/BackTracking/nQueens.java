public class nQueens {

    public static boolean isSafe(char board[][],int row,int col) {
        // vertical up
      for (int i=row-1; i>=0 ; i--) {
        if (board[i][col]=='Q') {
            return false;
        }
      }


        // diagonal left up
        for (int i=row-1,j=col-1; i>=0&&j>=0 ; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
           
          }


        // diagonal right up

        for (int i=row-1,j=col+1; i>=0&&j<board.length ; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
}

          return true;
        }
    public static void nQueen(char board[][],int row  ){
        // base 
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;    
        }
    // column loop - N queens ek column pe loop lagayega
        for (int j = 0; j < board.length; j++) {

            if(isSafe(board,row,j)){
                board[row][j]='Q';
                // ye row pe queen kobithayega aur column me move karega
                // isme is row ke column pe humne Q ko bitha diya 
                nQueen(board,row+1);                 
                // function call for next row
                // next row pe humne queen ko call kar diya
                board[row][j]= 'X';
                // backtracking call
                // jab hum backtrck hokar aye toh humne queen ko vaha se hata diya
            }
            
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------------X------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

     static int count=0;
    public static void main (String args[]){
        int n=5;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueen(board,0);
        System.out.println("total ways to solve nqueens ="+ count);
    }
}


// here now we have to do the modification in the code we have to find the place were we make the queen to sit so that it is not attacked by any another queen.
// here we have to analyze that isSafe(board,row,j) which means board pe kiss row aur column pe bithana theek hoga.


// Time Complexity of nQueens are O(n!) because if we have n No of Queens then for first queen to sit we have n no of place and for second queen we have n-1 places and for nth queen we have one place therfore so total time complexity is O(n!)
// recurrence relation of how much time it will take to make to make n queen be seated

 // T(n)=1Queenplace*T(n-1)+isSafe() 
// T(n)=n*T(n-1)+isSafe() 

