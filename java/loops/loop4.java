// public class loop4{
//     public static void main(String args[]){
//         int n=10994;
//         while (n>0) {
//             int i=n%10;
//             System.out.print(i);
//             n=n/10;
//         }
//         System.out.println();
//     }
// }


import java.util.*;
public class loop4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        while (n>0) {
        int i=n%10;
        int rev=0;    
        rev=(rev*10)+i; 
        n=n/10;
         System.out.print(rev);                 
       }
    sc.close();
    }
}