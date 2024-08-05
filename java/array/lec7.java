import java.util.Scanner;

public class lec7 {
    public static void reverse(int number[]) {
        int first=0,last=number.length-1;
        while (first<last) {
            // swap
            int temp=number[last];
           number[last]=number[first];
           number[first]=temp;
           first++;
           last--;
        }
    }

    public static void main(String[] args) {
        int number[]= new int[6];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       for (int i = 0; i < number.length; i++) {
        number[i]=sc.nextInt();
       }
       reverse(number);
       for (int i = 0; i < number.length; i++) {
        
       System.out.print(number[i]+" ");
       }
       System.out.println();
       sc.close();
}
}
