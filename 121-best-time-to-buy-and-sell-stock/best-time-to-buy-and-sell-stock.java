class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int maxProfit=0,BestBuy=price[0];
        for(int i=0;i<n;i++){
            if(price[i]>BestBuy){
                maxProfit=Math.max(maxProfit,price[i]-BestBuy);

            }
            BestBuy=Math.min(BestBuy,price[i]);
        }
        return maxProfit;
    }
}