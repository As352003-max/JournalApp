import java.util.*;

public class string {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e'};
        String str="abcd";
        String str2=new String("xyz");

        // strings are immutable

        Scanner sc=new Scanner(System.in);
     String name ;
    //  sc.next() will not print after space between words
    // to print after the space we need to use sc.nextLine()
    //  name=sc.next();
     name=sc.nextLine();
    
     System.out.println(name);
     sc.close();
    }
}
