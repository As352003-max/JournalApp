public class lec12 {
    public static void maxSubarraysSum(int numbers[]) {
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
      
        for (int i = 0; i < numbers.length; i++) {
            currsum=currsum+numbers[i];
          if (currsum<0) {
            currsum=0;
          }
          maxSum=Math.max(currsum,maxSum);
      }
      System.out.println("max subarrays sum is:"+maxSum);
  
  }
    
       
    
      
         public static void main(String[] args) {
          int numbers[]= {1,-2,6,-1,3};
         
         maxSubarraysSum(numbers);
         
         
  }
  
  
  
  
  
  
}
