import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciTest {

    @Test
    public void testThatTribonacciNumberOf4TermIsFour(){
        int n = 4;
        int result = 4;
        assertEquals(result, Tribonacci.tribonacci(n));
    }
    @Test
    public void testThatTribonacciNumberOf3TermIsTwo(){
        int n = 3;
        int result = 2;
        assertEquals(result, Tribonacci.tribonacci(n));
    } @Test
    public void testThatTribonacciNumberOf25TermIs1389537(){
        int n = 25;
        int result = 1389537;
        assertEquals(result, Tribonacci.tribonacci(n));
    }

}