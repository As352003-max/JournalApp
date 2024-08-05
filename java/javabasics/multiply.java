import java.util.*;
public class multiply {
    public static int multiplication(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int a=sc.nextInt();
        System.out.println("enter the no:");
        int b=sc.nextInt();
        int prod=multiplication(a,b);
        System.out.println("a*b="+prod);
 sc.close();
    }
   
}
