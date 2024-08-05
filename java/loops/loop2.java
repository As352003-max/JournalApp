import java.util.*;
public class loop2 {
 public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the value of n:");
    int n=sc.nextInt();
    int i,sum=0;
    i=1;
    while (i<=n) {
     sum=sum+i;
        i++;
    }
    System.out.println(sum);
    sc.close();
 }
}
