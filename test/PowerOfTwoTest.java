import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    public void testThat4IsAPowerOfTwo(){
        assertTrue(PowerOfTwo.isPowerOfTwo(4));
    }
    @Test
    public void testThat16IsAPowerOfTwo(){
        assertTrue(PowerOfTwo.isPowerOfTwo(16));
    }
    @Test
    public void testThat6IsNotPowerOfTwo(){
        assertFalse(PowerOfTwo.isPowerOfTwo(6));
    }
    @Test
    public void testThat1IsAPowerOfTwo(){
        assertTrue(PowerOfTwo.isPowerOfTwo(1));
    }
    @Test
    public void testThat3IsAPowerOfTwo(){
        assertFalse(PowerOfTwo.isPowerOfTwo(3));
    }

}