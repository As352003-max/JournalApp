import java.util.*;
public class primeno {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if (n==2) {
        System.out.println("the no is prime");}
        else {
        boolean isPrime=true;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0) {
                isPrime=false;
            }else
            if (isPrime==true) {
                System.out.println("no is prime");
            }else{System.out.println("no is not prime");
        }
        sc.close();
    }
}
}
}