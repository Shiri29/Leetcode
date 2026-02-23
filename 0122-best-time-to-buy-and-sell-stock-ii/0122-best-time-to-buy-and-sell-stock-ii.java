class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int net[] = new int[n];
        
        int i=0;
        while(i+1<n){
            net[i] = prices[i+1] - prices[i];
            i++;
        }

        int totalProfit = 0;

        for(int j=0;j<n;j++){
            if(net[j] > 0){
                totalProfit += net[j];
            }
        }

        return totalProfit;
    }
}