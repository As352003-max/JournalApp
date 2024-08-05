import java.util.*;
public class typcasting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // float a=23.54f;
        // int b=a;
        // cannot be done because float ha more memory than int and it will be memory loss
        // tycasting will be done
        float a=23.54f;
        int b=(int)a;
        System.out.println(b);
        sc.close();
    }

}
