import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPositiveIntegerTest {

    @Test
    public void testThatLargestPositiveIntegerWithItReturnThree(){
        int[] nums = {1,2,-3,3};
        int max = 3;
        assertEquals(max, LargestPositiveInteger.findMaxK(nums));
    }

    @Test
    public void testThatLargestPositiveIntegerWithItReturnsSeven(){
        int[] nums = {-1,10,6,7,-7,1};
        int max = 7;
        assertEquals(max, LargestPositiveInteger.findMaxK(nums));
    }

    @Test
    public void testThatLargestPositiveIntegerWithItReturnsMinusOneCauseNoMaximum(){
        int[] nums = {-10,8,6,7,-2,-3};
        int max = -1;
        assertEquals(max, LargestPositiveInteger.findMaxK(nums));
    }


}