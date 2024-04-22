import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseOrHasTrailingZeroTest {

    @Test
    public void testHasTrailingZeroIsTrue(){
        int[] nums = {1,2,3,4,5};
        assertTrue(BitwiseOrHasTrailingZero.hasTrailingZero(nums));
    }

    @Test
    public void testHasTrailingZeroWhenTheSizeIsFourReturnTrue(){
        int [] nums = {2,4,8,16};
        assertTrue(BitwiseOrHasTrailingZero.hasTrailingZero(nums));
    }

    @Test
    public void testHasTrailingZeroWhenTheSizeIsFiveReturnFalse(){
        int[] nums = {1,3,5,7,9};
        assertFalse(BitwiseOrHasTrailingZero.hasTrailingZero(nums));
    }

}