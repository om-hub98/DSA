package Array;

/**
 * @author omraj
 */
public class SpecialDiscount {
    public static void main(String[] args) {
        int[] input = {8,7,4,2,8,1,7,7,10,1};
        int[] result = finalPrices(input);
        for(int i:result){
            System.out.print(i+", ");
        }

    }
    public static int[] finalPrices(int[] prices) {
        int[] result=prices.clone();
        int discount=0;
        for(int outer=0; outer < prices.length; outer++){
            for(int inner=outer+1; inner < prices.length; inner++){
                if(prices[outer]  >= prices[inner]){
                    discount = prices[inner];
                    break;
                }
                else{
                    discount=0;
                }
            }
            result[outer] = prices[outer] - discount;
            discount=0;
        }
        return result;
    }
}
