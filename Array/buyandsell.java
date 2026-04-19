public class buyandsell {
    public static int findprofit(int[] prices){
        int max_profit = 0;
        int buying_price = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(buying_price < prices[i]){
                max_profit = Math.max(max_profit, prices[i] - buying_price);
            }else{
                buying_price = prices[i];
            }
           
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println("max profit : " + findprofit(prices));
    }
}
