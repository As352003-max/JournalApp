import java.util.*;
public class decimalconversion {
    public static void decTobin(int n) {
    int Mynumber=n;
    int binnum=0;
    int pow=0;

    while (n>0) {
        int rem=n%2;
        binnum=binnum+rem*((int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.print("binary form of:"+Mynumber+"="+binnum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        decTobin(n);
        sc.close();
    }
}
