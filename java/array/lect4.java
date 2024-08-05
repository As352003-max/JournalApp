import java.util.*;

public class lect4 {

    public static int LinearSearch(int number[],int key) {
        for (int i= 0; i< number.length; i++) {
             if (number[i]==key) {
            return i;
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
       int index=LinearSearch(number, key);
       if (index==-1) {
        System.out.println("Number not found");
       } else {
        System.out.println("number found at index:"+index);
       }
       sc.close();
    }
}
