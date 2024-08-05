import java.util.*;
public class pattern6 {
    public static void inverted_half_numpyramid(int n) {
        for (int i = 1; i < n; i++) {
           
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        inverted_half_numpyramid(n);
        sc.close();
    }
}
