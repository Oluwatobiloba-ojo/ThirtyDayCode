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
    }@Test
    public void testThatMaximumSumOfADistinctSubArrayOfArray111789Is24(){
        int [] nums = {1,1,1,7,8,9};
        /*
        1   1   1 -> 3
            1   1   7 -> 9
                1   7   8 -> 16
                    7   8   9 -> 24
         */
        int k = 3;
        int result = 24;
        assertEquals(result, MaximumSumOfSubArray.maximumSubarraySum(nums, k));
    }
    @Test
    public void testThatMaximumSumOfADistinctSubArrayOfArray999123Is12(){
        int [] nums = {9,9,9,1,2,3};
        /*
        1   1   1 -> 3
            1   1   7 -> 9
                1   7   8 -> 16
                    7   8   9 -> 24
         */
        int k = 3;
        int result = 12;
        assertEquals(result, MaximumSumOfSubArray.maximumSubarraySum(nums, k));
    }



}