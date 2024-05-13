import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyTwoChocolateTest {

    @Test
    public void testThatWhenASumOfTwoNumberInAnArrayIsEqualTheMoneyToBuy(){
        int[] prices = {1, 2, 2};
        int money = 3;
        int output = 0;
        int result = BuyTwoChocolate.butChoco(prices, money);
        assertEquals(output, result);
    }@Test
    public void testThatWhenASumOfTwoNumberInAnArrayIsNotEqualTheMoneyToBuyReturnsTheMoney(){
        int[] prices = {3, 2, 3};
        int money = 3;
        int output = 3;
        int result = BuyTwoChocolate.butChoco(prices, money);
        assertEquals(output, result);
    }

}