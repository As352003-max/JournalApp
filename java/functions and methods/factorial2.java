import java.util.*;
public class factorial2 {
    public static int fac(int n){
      int fac=1;
      for (int i = 1; i <=n; i++) {
        fac=fac*i;
      }
        return fac;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int factorial=fac(n);
        System.out.println("factorial of the no is:"+factorial);
        sc.close();
    }
}
