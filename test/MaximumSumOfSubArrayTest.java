import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfSubArrayTest {

    @Test
    public void testThatMaximumSumOfASubArrayOfArray1542999Is15(){
        int [] nums = {1,5,4,2,9,9,9};
        int k = 3;
        int result = 15;
        assertEquals(result, MaximumSumOfSubArray.maximumSubarraySum(nums, k));
    }
    @Test
    public void testThatMaximumSumOfADistinctSubArrayOfArray444Is0(){
        int [] nums = {4,4,4};
        int k = 3;
        int result = 0;
        assertEquals(result, MaximumSumOfSubArray.maximumSubarraySum(nums, k));
    }



}