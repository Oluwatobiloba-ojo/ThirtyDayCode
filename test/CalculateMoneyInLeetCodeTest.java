import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetCodeTest {

    @Test
    public void tesThatTheMoneyCalculatedWillGiveUsTheTotalSavingOfTheDay4(){
        int day = 4;
        int result = 10;
        assertEquals(result, CalculateMoneyInLeetCode.totalMoney(day));
    }@Test
    public void tesThatTheMoneyCalculatedWillGiveUsTheTotalSavingOfTheDay10(){
        int day = 10;
        int result = 37;
        assertEquals(result, CalculateMoneyInLeetCode.totalMoney(day));
    }
    @Test
    public void tesThatTheMoneyCalculatedWillGiveUsTheTotalSavingOfTheDay20(){
        int day = 20;
        int result = 96;
        assertEquals(result, CalculateMoneyInLeetCode.totalMoney(day));
    }



}