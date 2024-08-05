import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fac=1;
        System.out.println("enter the number:");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fac*=i;
       }
              
      System.out.println("factorial:"+fac);
       sc.close();
    }
}
