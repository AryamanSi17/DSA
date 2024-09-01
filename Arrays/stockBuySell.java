package Arrays;

public class stockBuySell {
    int maxProfit(int price[]){
        int profit=0;
        for(int i=0;i<price.length-1;i++){
            if(price[i]<price[i+1]){
                profit+=price[i+1]-price[i];
            }
        }
        return profit;
    }
}
