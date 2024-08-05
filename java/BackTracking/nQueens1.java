// code to print only one solution
// isme nQueen ko boolean type ka bana diya hai jaise hi humme ek solution milega ye return true kardega agar jo pehla ek solution possible hai usko print kardega

public class nQueens1 {
    
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
    public static boolean  nQueen(char board[][],int row  ){
        // base 
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;    
        }
    // column loop - N queens ek column pe loop lagayega
        for (int j = 0; j < board.length; j++) {

            if(isSafe(board,row,j)){
                board[row][j]='Q';
                // ye row pe queen kobithayega aur column me move karega
                // isme is row ke column pe humne Q ko bitha diya 
              if(nQueen(board,row+1)){
                 return true;
              }               
                // function call for next row
                // next row pe humne queen ko call kar diya
                board[row][j]= 'X';
                // backtracking call
                // jab hum backtrck hokar aye toh humne queen ko vaha se hata diya
            }
         }
        return false;
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

       if(nQueen(board,0)){
           System.out.println("solution is possible");
           printBoard(board);
       } else {
        System.out.println("solution is not possible");
       }
        // System.out.println("total ways to solve nqueens ="+ count);
    }
}



