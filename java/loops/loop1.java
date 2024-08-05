import java.util.*;
public class loop1 {
 public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the value of n:");
    int n=sc.nextInt();
    int i;
    i=1;
    while (i<=n) {
        System.out.print(i+" ");
        i++;
    }
    System.out.println();
    sc.close();
 }
}
