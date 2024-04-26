import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {


    @Test
    public void testThatSingleNumberIsBeenReturns(){
        int[] nums = {2, 2, 1};
        int single  = 1;
        assertEquals(single, SingleNumber.isPalindrome(nums));
    }
}
