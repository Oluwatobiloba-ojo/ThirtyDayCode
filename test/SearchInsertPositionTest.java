import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest{

    @Test
    public void testThatTargetFiveReturnsTwoInAnArrayOf1356(){
        int[] nums = {1, 3, 5, 6};
        int targets = 5;
        int result = 2;
        assertEquals(result, SearchInsertPosition.searchInsert(nums, targets));
    }

    @Test
    public void testThatTarget2ReturnThaIndexWhichCanBeInsertInAnArrayOf1356(){
        int[] nums = {1, 3, 5, 6};
        int targets = 2;
        int result = 1;
        assertEquals(result, SearchInsertPosition.searchInsert(nums, targets));
    }
    @Test
    public void testThatTarget7ReturnTheIndexWhichCanBeInsertInAnArrayOf1356(){
        int[] nums = {1, 3, 5, 6};
        int targets = 7;
        int result = 4;
        assertEquals(result, SearchInsertPosition.searchInsert(nums, targets));
    }
    @Test
    public void testThatTarget11ReturnTheIndexWhichCanBeInsertInAnArrayOf234789(){
        int[] nums = {2,3,4,7,8,9};
        int targets = 11;
        int result = 6;
        assertEquals(result, SearchInsertPosition.searchInsert(nums, targets));
    }


}