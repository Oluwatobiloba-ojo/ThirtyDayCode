import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleArrayTest {

    @Test
    public void testThatAnArrayReturnsTheDoubleOfAnArray(){
        int[] nums = {4, 5, 8};
        int[] output = {4, 5, 8, 8, 10, 16};
        assertArrayEquals(output, DoubleArray.doubleArray(nums));
    }

}