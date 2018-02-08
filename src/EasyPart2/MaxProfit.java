package EasyPart2;

public class MaxProfit {
	public int maxProfit(int[] prices) {
		int maxprofit=0, minprice=Integer.MAX_VALUE;
		for (int i=0; i<prices.length;i++) {
			if(minprice>prices[i])
				minprice = prices[i];
			else if(prices[i]-minprice > maxprofit)
				maxprofit = prices[i]-minprice;
		}
		return maxprofit;
	}
}
