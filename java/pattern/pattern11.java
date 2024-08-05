import java.util.*;
public class pattern11 {
    
    public static void Hollow_Rohumbus_pattern(int n) {
        for (int i= 1; i <=n; i++) {
            // for space
            for (int j = 1; j <=n-i; j++) {
             System.out.print(" ");
                }
            //  for stars hollow rectangle
            for (int j = 1; j<=n; j++) {
                if (i==1||i==n||j==1||j==n) {
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        
        Hollow_Rohumbus_pattern(n);
        sc.close();
    }
}
