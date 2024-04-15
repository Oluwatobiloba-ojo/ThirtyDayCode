import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEncryptedIntegersTest {

    @Test
    public void testThatSumUpIntegersAndReturnTheSum(){
        int[] numbers = {10, 21, 31};
        int output = SumOfEncryptedIntegers.sumUpEncrypt(numbers);
        int result = 66;
        assertEquals(output, result);
    }

    @Test
    public void testThatSumUpIntegersAndReturnTheSumOf6(){
        int[] numbers = {1, 2, 3};
        int output = SumOfEncryptedIntegers.sumUpEncrypt(numbers);
        int result = 6;
        assertEquals(output, result);
    }

}