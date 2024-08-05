// Butterfly Pattern
import java.util.Scanner;
public class pattern9 {

    public static void Butterfly_Pattern(int n) {
        for (int i= 0; i <=n; i++) {
            // for stars
            for (int j = 1; j <=i; j++) {
             System.out.print("*");
                }
            //  for spaces
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                 System.out.print("*");
            }
            System.out.println();
        }
         for (int i= n; i>=1; i--) {
            // for stars
            for (int j = 1; j <=i; j++) {
             System.out.print("*");
                }
            //  for spaces
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        
        Butterfly_Pattern(n);
        sc.close();
    }
}

