public class sudokuSolvers {

   public static boolean isSafe(int sudoku[][],int row,int col,int digit) {
    // condition for column 
    for (int i = 0; i<=8; i++) {
       if(sudoku[i][col] == digit){
        return false;
       } 
    }

    // condition for row
    for (int j = 0; j<=8; j++) {
        if(sudoku[row][j] == digit){
            return false;
        } 
    }

    // condition for grid
    int sr = (row/3)*3;
    int sc = (col/3)*3;
    for (int i = sr; i < sr+3; i++) {
        for (int j = sc; j < sc+3; j++) {
            if (sudoku[i][j]==digit) {
             return false;   
            }
        }
    }
      
    return true;
   }



    public static boolean sudokuSolver(int sudoku[][],int row,int col) {
        // base case
        // if (row==9&&col==9) {
        //     return true;
        // }
        if (row==9) {
            return true;
        }
        // rec ursion
      int nextRow = row , nextCol = col+1;
    //   same row ke andar hum column ko badhate jaa rahe hai aur agar jaise hi column 9 ke barabar hoga hum next row pe chale jayenge
      if (col+1==9) {
        nextRow=row+1;
        nextCol=0;
      }
    //   this condition is there for already set elements
      if (sudoku[row][col]!=0) {
        return sudokuSolver(sudoku, nextRow, nextCol);
      }
    
    //   this condition is there for new elements to insert
        for (int digit = 1; digit <=9 ; digit++) {
            if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col]=digit;
           if(sudokuSolver(sudoku,nextRow,nextCol)) {
            // solution exist
            return true;
           }
           sudoku[row][col]=0;
        }
     }

     return false;
}

public static void printSudoku(int sudoku[][]) {
  for (int i = 0; i < 9; i++) {
    for (int j = 0; j < 9; j++) {
      System.out.print(sudoku[i][j]+" "); 
    }
    System.out.println();
  }
}
    public static void main(String[] args) {
        int sudoku[][]= {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
         {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        if (sudokuSolver(sudoku,0,0)) {
          System.out.println("solution exists");
          printSudoku(sudoku);
        } 
        else{
          System.out.println("Solution does not exist");
        }
    }
}
