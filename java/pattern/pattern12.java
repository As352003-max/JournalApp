import java.util.*;
public class pattern12 {
    
    public static void diamond_pattern(int n) {
        for (int i= 1; i <=n; i++) {
            // for space
            for (int j = 1; j <=n-i; j++) {
             System.out.print(" ");
                }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }    
            System.out.println();
        }
        for (int i= n; i >=1; i--) {
            // for space
            for (int j = 1; j <=n-i; j++) {
             System.out.print(" ");
                }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }  
            System.out.println();  
        }
    }



public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    
    diamond_pattern(n);
    sc.close();
}
}
