import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainDuplicateTest {

    @Test
    public void testReturnFalseCauseItDoesNotContainDuplicate(){
        int[] nums = {1, 2, 3, 4};
        assertFalse(ContainDuplicate.containsDuplicate(nums));
    }
    @Test
    public void testReturnTrueCauseItContainDuplicate(){
        int[] nums = {1, 2, 3, 4, 1};
        assertTrue(ContainDuplicate.containsDuplicate(nums));
    }


}
