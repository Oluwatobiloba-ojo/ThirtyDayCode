import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void testThatTargetNineWillReturnTheIndexOfTwoValueInAnArrayWhichCanBeSumToGiveTheTarget(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        int[] output = {0, 1};
        assertArrayEquals(result, output);
    }

    @Test
    public void testThatTwoSumReturnsTheIndexThatWillSumUpToBeSix(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        int[] output = {1, 2};
        assertArrayEquals(result, output);
    }

    @Test
    public void testThatTwoSumReturnsTheIndexZeroOneThatWillSumUpToBeSix(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = TwoSum.twoSum(nums, target);
        int[] output = {0, 1};
        assertArrayEquals(result, output);
    }


}