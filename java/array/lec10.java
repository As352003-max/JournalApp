import java.util.Scanner;
// BRUTE FORCE
public class lec10 {
    public static void printSubarraysSum(int numbers[]) {
      int currsum=0;
      int maxSum=Integer.MIN_VALUE;
       for (int i = 0; i < numbers.length; i++) {
        int start=i;
      for (int j = i; j < numbers.length; j++) {
        int end=j;
        currsum=0;
        for (int k= start; k <=end; k++) {
          currsum+=numbers[k];
       }
       System.out.println(currsum);
       if (maxSum<currsum) {
        maxSum=currsum;
       }
    }
}
       
System.out.println("maxSum:"+maxSum);    
       }
     
  
    
       public static void main(String[] args) {
        int numbers[]= new int[5];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       for (int i = 0; i < numbers.length; i++) {
        numbers [i]=sc.nextInt();
       }
       printSubarraysSum(numbers);
       
       sc.close();
}
}


