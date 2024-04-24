import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfOneAndZeroTest {

    @Test
    public void testThatEvenNumberGivenToFunctionReturnZero(){
        int even = 2;
        assertEquals(0, ArrayOfOneAndZero.checkEvenOrOdd(even));
    }

    @Test
    public void testThatNumberWhichAreEvenChangeToZeroAndOddChangesToOnes(){
        int[] input = {4, 5, 8, 8, 2, 9};
        int[] output = {0, 1, 0, 0, 0, 1};
        assertArrayEquals(output, ArrayOfOneAndZero.change(input));
    }




}
