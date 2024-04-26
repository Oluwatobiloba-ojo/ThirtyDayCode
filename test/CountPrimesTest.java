import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrimesTest {

    @Test
    public void testThatPrimeValueBelow10Is2357(){
        int n = 10;
        int numberOfPrime = 4;
        assertEquals(numberOfPrime, CountPrime.countPrimes(n));
    }
    @Test
    public void testThatPrimeValueBelow0Is0(){
        int n = 0;
        int numberOfPrime = 0;
        assertEquals(numberOfPrime, CountPrime.countPrimes(n));
    }
    @Test
    public void testThatPrimeValueBelow1Is0(){
        int n = 1;
        int numberOfPrime = 0;
        assertEquals(numberOfPrime, CountPrime.countPrimes(n));
    }
}
