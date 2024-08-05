public class RecursionBasics10 {
        public static int optimizedPower(int x,int n) {
            if (n==0) {
                return 1;
            }
           int halfPower=optimizedPower(x,n/2);
           int halfPowerSquare=halfPower*halfPower;
        //    for odd value of n
           if (n%2!=0) {
            halfPowerSquare=x*halfPowerSquare;
           }
           return halfPowerSquare;
        }
        public static void main(String args[]){
            System.out.println(optimizedPower(2,5));
        }
    }
    

