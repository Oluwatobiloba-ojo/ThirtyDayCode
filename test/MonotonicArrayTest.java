import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonotonicArrayTest {

    @Test
    public void testThatArrayWhichIsAscendingOrderIsMonotonic(){
        int[] nums = {1,2,2,3};
        assertTrue(MonotonicArray.isMonotonic(nums));
    }

    @Test
    public void testThatArrayWhichIsNotDescendingOrAscendingIsNotMonotonic(){
        int[] nums = {1,3,2};
        assertFalse(MonotonicArray.isMonotonic(nums));
    }

    @Test
    public void testThatArrayWhichIsInDescendingOrderIsMonotonic(){
        int[] nums = {6, 5, 4, 4};
        assertTrue(MonotonicArray.isMonotonic(nums));
    }
}
