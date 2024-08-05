import java.util.Scanner;

public class lec8 {
    public static void printPairs(int numbers[]) {
      int tp=0;
       for (int i = 0; i < numbers.length; i++) {
        int curr=numbers[i];
      for (int j = i+1; j < numbers.length; j++) {
        System.out.print("("+curr+","+numbers[j]+")");
        tp++;
       }
       System.out.println();
       }
      System.out.println("total pairs="+tp); 
    }
       public static void main(String[] args) {
        int numbers[]= new int[6];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       for (int i = 0; i < numbers.length; i++) {
        numbers [i]=sc.nextInt();
       }
       printPairs(numbers);
       
       sc.close();
}
}
