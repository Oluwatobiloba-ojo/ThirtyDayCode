import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveKDigitTest {

    @Test
    public void testThatRemoveDigitReturnsTheSmallestWhenTheDigitIsRemoved(){
        String value = "1432219";
        int k = 3;
        String result = RemoveKDigit.removeKDigits(value, k);
        String outPut = "1219";
        assertEquals(result, outPut);
    }
    @Test
    public void testThatRemoveDigitBy2ValueReturnsTheSmallestWhenTheDigitIsRemoved(){
        String value = "10";
        int k = 2;
        String result = RemoveKDigit.removeKDigits(value, k);
        String outPut = "0";
        assertEquals(result, outPut);
    }
    @Test
    public void testThatRemoveDigitBy1ValueReturnsTheSmallestWhenTheDigitIsRemoved(){
        String value = "10200";
        int k = 1;
        String result = RemoveKDigit.removeKDigits(value, k);
        String outPut = "200";
        assertEquals(result, outPut);
    }






}
