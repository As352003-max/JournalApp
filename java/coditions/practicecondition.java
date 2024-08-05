// question 1

// import java.util.*;
// public class practicecondition {
//     public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     float number=sc.nextFloat();
//     if (number<0) {
//         System.out.println("the no is negative");
//     }
//     else if (number>0) {
//         System.out.println("the no is positive");
//     }
//     sc.close();
//     }
// }

// question 2

// import java.util.*;
// public class practicecondition{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("temprature:");
//         float temprature=sc.nextFloat();
//         if (temprature>100) {
//             System.out.println("you have fever");
//         }
//         else{
//             System.out.println("you dont have fever");
//         }
//         sc.close();
//        }
// }

// question 3

import java.util.*;
public class practicecondition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Year:");
        double Year=sc.nextDouble();
        boolean x=(Year%4)==0;
        boolean y=(Year%100)!=0;
        boolean z=((Year%100==0)&&(Year%400==0));
        if (x&&(y||z)) {
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        sc.close();
       }
}