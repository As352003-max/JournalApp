import java.util.Scanner;

public class lec6 {
    public static int BinarySearch(int number[],int key) {
        int start=0,end=number.length-1;
        while (start<=end) {
            int midterm=(start+end)/2;
            // comparision
            if (number[midterm]==key) {
                return midterm;
            }
            // right
            if (number[midterm]<key) {
              start=midterm+1;
            }
            // left
            else {
               end= midterm-1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int number[]= new int[10];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       for (int i = 0; i < number.length; i++) {
        number[i]=sc.nextInt();
       }
       System.out.print("enter the value of key:");
       int key=sc.nextInt();
      System.out.println("number found at index:"+BinarySearch(number, key));
    sc.close();
}
}
