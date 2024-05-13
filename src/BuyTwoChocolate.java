import java.util.Arrays;

public class BuyTwoChocolate {

    public static int butChoco(int[] prices, int money) {
        prices = Arrays.stream(prices).sorted().toArray();
        if (prices[1] + prices[0] <= money) return (prices[1] + prices[0]) - money;
        else return money;
    }
}
