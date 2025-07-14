package Arrays.Medium;

public class BestTimeToBuyAndSell {
  public int maxProfit(int[] arr) {
    int buy = arr[0], profit = 0;
    int maxProfit = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] < buy){
            buy = arr[i];
        }else{
            profit = arr[i] - buy;
        }
        if(profit > maxProfit){
            maxProfit = profit;
        }
    }
    return maxProfit;
  }
  public static void main(String args[]){
    int[] arr = {10, 7, 5, 8, 11, 9};
    BestTimeToBuyAndSell sol = new BestTimeToBuyAndSell();
    System.out.println(sol.maxProfit(arr));
  }
}