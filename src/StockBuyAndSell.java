class StockBuyAndSell{

  public static int maxProfit(int[] prices) {
    int res = 0;

    for(int i=0; i<prices.length;i++) {
      if(prices[i] > prices[i-1]) {
        res += prices[i] - prices[i-1];
      }
    }
    return res;
  }
  
  
  public static void main(String[] args) {
    
  }
}
