import java.util.*;
public class primeno2 {
    public static boolean isPrime(int n) {
        if (n==2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
             return false;   
            }
        }
        return true;
    }
    
    public static void primesInrange(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i+"");
                }}
            System.out.println(" ");
            }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number:");
     int n=sc.nextInt();
    primesInrange(n);
    sc.close();
}

   }
   
