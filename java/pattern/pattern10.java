import java.util.*;
public class pattern10 {
    public static void Rohumbus_pattern(int n) {
        for (int i= 1; i <=n; i++) {
            // for space
            for (int j = 1; j <=n-i; j++) {
             System.out.print(" ");
                }
            //  for stars 
            
            for (int j = 1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        
        Rohumbus_pattern(n);
        sc.close();
    }
}
