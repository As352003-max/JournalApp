import java.util.*;
public class Javabasics{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("avg of three no:"+avg);
        sc.close();
    }
}



// public class Javabasics {
//     public static void main(String args[]){
//          int $=24;      
//         //  $ ,- are identifiers so they don't give errors
//         System.out.println($);
//     }
// }


//   import java.util.*;
// public class Javabasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         float pencil=sc.nextFloat();
//         float pen=sc.nextFloat();
//         float eraser=sc.nextFloat();
//         float total=pencil+pen+eraser;
//         System.out.println(total);
//         float Newtotal= total+(0.18f*total);
//         System.out.println(Newtotal);
//         sc.close();
//     }
//     }