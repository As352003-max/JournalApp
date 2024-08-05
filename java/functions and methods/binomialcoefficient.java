public class binomialcoefficient {
    public static int fac(int n){
        int fac=1;
        for (int i = 1; i <=n; i++) {
            fac*=i;
        }
        return fac;
    }
    
        public static int binCoeff(int n,int r) {
           int fac_n=fac(n);
           int fac_r=fac(r);
           int fac_nmr=fac(n-r);
           int binCoeff=fac(n)/(fac(r)*fac(n-r));
           return binCoeff;
        }
        public static void main(String[] args) {
            System.out.println(binCoeff(5,2));
        }
        
    }

