import java.util.*;
public class lec5 {
    public static int LargestNumber(int number[]) {
        // Integer.MIN_VALUE= -infinity Integer.Max_VALUE=+infinity
        int largest=Integer.MIN_VALUE;  
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest=number[i];
            }
            if (smallest>number[i]) {
                smallest=number[i];
                
            }
            
        }
        System.out.println("Smallest number is:"+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int number[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i]=sc.nextInt();
        }
        LargestNumber(number);
        System.out.println("Largest number is:"+LargestNumber(number));
        sc.close();
    }
}
