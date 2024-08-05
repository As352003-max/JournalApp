public class matrices1 {
    public static void PrintSpiral(int matrix[][]) {
        int StartRow=0;
        int StartCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while (StartRow<=endRow&&StartCol<=endCol) {
            for (int j= StartCol; j<= endCol; j++) {
                System.out.println(matrix[StartRow][j]+" ");
            }
            for (int i= StartRow+1; i<= endRow; i++) {
                System.out.println(matrix[i][endCol]+" ");
            }
            for (int j= endCol-1; j>= StartCol; j--) {
                System.out.println(matrix[endRow][j]+"");
            }
           for (int i= endRow-1; i>= StartRow+1; i--) {
                System.out.println(matrix[i][StartCol]+" ");
            }
            StartCol++;
            StartRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintSpiral(matrix);
    }
}
