import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationTest {

    @Test
    public void testThatTheReversePolishNotationOfThisInputReturn9(){
        String [] input = {"2","1","+","3","*"};
        assertEquals(9, ReversePolishNotation.evalRPM(input));
    }@Test
    public void testThatTheReversePolishNotationOfThisInputReturn22(){
        String [] input = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, ReversePolishNotation.evalRPM(input));
    }@Test
    public void testThatTheReversePolishNotationOfThisInputReturn1(){
        String [] input = {"4", "3", "-"};
        assertEquals(1, ReversePolishNotation.evalRPM(input));
    }@Test
    public void testThatTheReversePolishNotationOfThisInputReturn7(){
        String [] input = {"4", "-3", "-"};
        assertEquals(7, ReversePolishNotation.evalRPM(input));
    }@Test
    public void testThatTheReversePolishNotationOfThisInputReturnMinus1(){
        String [] input = {"4", "-3", "-", "8", "-"};
        assertEquals(-1, ReversePolishNotation.evalRPM(input));
    }

}