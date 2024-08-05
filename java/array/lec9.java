import java.util.Scanner;

public class lec9 {
    public static void printSubarrays(int numbers[]) {
      int ts=0;
       for (int i = 0; i < numbers.length; i++) {
        int start=i;
      for (int j = i; j < numbers.length; j++) {
        int end=j;
        for (int k= start; k <=end; k++) {
           System.out.print(numbers[k]+" ");
       }
       ts++;
      System.out.println(); 
    }
System.out.println();
       }
     System.out.println("total pairs are:"+ts);
  
    }
       public static void main(String[] args) {
        int numbers[]= new int[6];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       for (int i = 0; i < numbers.length; i++) {
        numbers [i]=sc.nextInt();
       }
       printSubarrays(numbers);
       
       sc.close();
}
}
