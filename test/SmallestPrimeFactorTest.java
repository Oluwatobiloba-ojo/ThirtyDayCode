import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPrimeFactorTest {

    @Test
    public void testThatSmallestPrimeFactorCanInThisArrayIsTwoAndFive(){
        int[] numbers = {1, 2, 3, 5};
        int constant = 3;
        int[] result = {2, 5};
        assertArrayEquals(result, SmallestPrimeFactor.kthSmallestPrimeFactor(numbers, constant));
    } @Test
    public void testThatSmallestPrimeFactorCanInThisArrayIsOneAndSeven(){
        int[] numbers = {1, 7};
        int constant = 1;
        int[] result = {1, 7};
        assertArrayEquals(result, SmallestPrimeFactor.kthSmallestPrimeFactor(numbers, constant));
    }

}