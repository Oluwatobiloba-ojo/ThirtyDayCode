import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {


    @Test
    public void testThatSingleNumberIsBeenReturns(){
        int[] nums = {2, 2, 1};
        int single  = 1;
        assertEquals(single, SingleNumber.isPalindrome(nums));
    }

    @Test
    public void testThatSingleNUmberIsBeenReturnWhichIs4(){
        int[] nums = {4,1,2,1,2};
        int single  = 4;
        assertEquals(single, SingleNumber.isPalindrome(nums));
    }
    @Test
    public void testThatSingleNUmberIsBeenReturnWhichIs1(){
        int[] nums = {1};
        int single  = 1;
        assertEquals(single, SingleNumber.isPalindrome(nums));
    }
}
