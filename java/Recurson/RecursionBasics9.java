public class RecursionBasics9 {
    public static int Power(int x,int n) {
        if (n==0) {
            return 1;
        }
        // int xnm1=Power(x,n-1);
        // int xn=x*xnm1;
        // return xn; 
        // we can replace this by just writting  
        return x*Power(x,n-1);
    }
    public static void main(String args[]){
        System.out.println(Power(2,5));
    }
}
