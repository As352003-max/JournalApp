import java.util.*;

public class pdome {
    public static boolean palindrome(int n) {
        int Mynumber=n;
        int rev=0;
        while (Mynumber!=0) {
            int remainder=Mynumber%10;
            rev=(rev*10)+remainder;
             Mynumber=Mynumber/10;   
        }
        if (n==rev) {
           return true; 
        }else{
        return false ;
    }
    } 
        
        
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number:");
       int Mynumber=sc.nextInt();
       if (palindrome(Mynumber)) {
            System.out.println("number:" + Mynumber + "A palindrome no");}
            else {
                 System.out.println("number:" + Mynumber + "Not a palindrome no");
       sc.close();
    }
}
}
