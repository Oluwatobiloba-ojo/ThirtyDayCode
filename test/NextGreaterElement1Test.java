import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElement1Test {

    @Test
    public void testThatNextGreaterElementInAnArrayGivesUs(){
        int[] subset = {4, 1, 2};
        int[] superset = {1, 3, 4, 2};
        int[] greater = {-1, 3, -1};
        assertArrayEquals(greater, NextGreaterElement1.nextGreaterElement(subset, superset));
    }

    @Test
    public void testThatNextGreaterElementInAnArrayGivesUs2(){
        int[] subset = {2, 4};
        int[] superset = {1, 2, 3, 4};
        int[] greater = {3, -1};
        assertArrayEquals(greater, NextGreaterElement1.nextGreaterElement(subset, superset));
    }


}
