import java.util.Scanner;

public class lec14 {
    public static int BuyandSellStocks(int prices[]){
        int Buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if (Buyprice< prices[i]) {
                // profit
                int profit=prices[i]-Buyprice;  
                //  todays profit
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                Buyprice=prices[i];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
         int prices[]= new int[6];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the prices:");
       for (int i = 0; i < prices.length; i++) {
        prices[i]=sc.nextInt();
       }
       System.out.println(BuyandSellStocks(prices));
       sc.close();
    }
}
