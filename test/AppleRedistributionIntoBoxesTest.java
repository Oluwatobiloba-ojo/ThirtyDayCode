import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppleRedistributionIntoBoxesTest {

    @Test
    public void testForTheCapacityOfACapacityOfBoxToFilledAnApple(){
        int[] apples = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};
        int output = 2;
        int result = AppleRedistributionIntoBoxes.minimumBoxes(apples, capacity);
        assertEquals(output, result);
    }
    @Test
    public void testForTheCapacityOfAllBoxToFilledAnApple(){
        int[] apples = {5, 5, 5};
        int[] capacity = {2, 4, 2, 7};
        int output = 4;
        int result = AppleRedistributionIntoBoxes.minimumBoxes(apples, capacity);
        assertEquals(output, result);
    }
    @Test
    public void testForTheCapacityOfAllBoxToFilledAnApple2(){
        int[] apples = {5, 5, 5};
        int[] capacity = {2, 4, 2, 7, 8};
        int output = 4;
        int result = AppleRedistributionIntoBoxes.minimumBoxes(apples, capacity);
        assertEquals(output, result);
    }

    @Test
    public void testSortDescending(){
        int[] numbers = {2, 4, 2, 7, 8};
        System.out.println(Arrays.toString(AppleRedistributionIntoBoxes.comparator(numbers)));
    }

    @Test
    public void testForTheCapacityOfAllBoxToFilledAnApple3(){
        int[] apples = {1,8,3,3,5};
        int[] capacity = {3,9,5,1,9};
        int output = 3;
        int result = AppleRedistributionIntoBoxes.minimumBoxes(apples, capacity);
        assertEquals(output, result);
    }



}