import java.util.*;
public class factorial1 {
    public static void factorial() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=sc.nextInt();
        int fac=1;
        for (int i = 1; i <=n; i++) {
            fac*=i;
       }
       System.out.println("factorial of the no is:"+fac);
       sc.close();
    }
    
    public static void main(String[] args) {
        factorial();
    }
}
