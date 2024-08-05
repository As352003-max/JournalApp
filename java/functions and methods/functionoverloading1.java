// function over loading using datatype
public class functionoverloading1 {
    // function to calculate sum of two numbers
    public static int sum(int a,int b) {
        return a+b;
    }
    // function to calculate sum of three numbers
    public static float sum(float a,float b,float c) {
        return a+b+c;
    } 
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,5.4f,4.9f));
    }
}

