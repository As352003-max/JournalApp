public class RecursionBasics5 {
    public static int fib(int n){
        if(n==1||n==0){
         return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fn=f1+f2;
        return fn;
 }
 public static void main(String[] args) {
     int n=5;
     System.out.println(fib(n));
     }
}


