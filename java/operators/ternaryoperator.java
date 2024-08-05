// import java.util.*;
// public class ternaryoperator {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         // ternary operator
//         String type=((number%2)==0)?"even":"odd";
//         System.out.println(type);
//         sc.close();
//     }
// }

// example of ternary operator

import java.util.*;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        // ternary operator
        String status=((number)>=33)?"pass":"fail";
        System.out.println(status);
        sc.close();
    }
}
