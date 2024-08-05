  import java.util.*;
public class binaryconversion {
     
    public static void binTodec(int binNum) {
    int Mynumber=binNum;
    int decNum=0;
    int pow=0;

    while (binNum>0) {
        int lastDigit=binNum%10;
        decNum=decNum+lastDigit*((int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.print("binary form of:"+Mynumber+"="+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number:");
        int decNum=sc.nextInt();
        
        binTodec(decNum);
        sc.close();
        
    }
}

