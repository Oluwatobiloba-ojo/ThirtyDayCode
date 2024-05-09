import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeHappinessTest {

    @Test
    public void testThatMaximizeHappinessInTheArrayIs4(){
        int[] happiness = {1, 2, 3};
        int constant = 2;
        long result = MaximizeHappiness.maximumHappinessSum(happiness, constant);
        long output = 4;
        assertEquals(result, output);
    }
    @Test
    public void testThatMaximizeHappinessInTheArrayIs1(){
        int[] happiness = {1, 1, 1, 1};
        int constant = 2;
        long result = MaximizeHappiness.maximumHappinessSum(happiness, constant);
        long output = 1;
        assertEquals(result, output);
    }
    @Test
    public void testThatMaximizeHappinessInTheArrayIs5(){
        int[] happiness = {2, 3, 4, 5};
        int constant = 1;
        long result = MaximizeHappiness.maximumHappinessSum(happiness, constant);
        long output = 5;
        assertEquals(result, output);
    }
    @Test
    public void testThatMaximizeHappinessInTheArrayIs53(){
        int[] happiness = {12,1,42};
        int constant = 3;
        long result = MaximizeHappiness.maximumHappinessSum(happiness, constant);
        long output = 53;
        assertEquals(result, output);
    }

}