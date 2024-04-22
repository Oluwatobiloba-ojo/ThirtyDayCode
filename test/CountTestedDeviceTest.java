import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTestedDeviceTest {


    @Test
    public void testThatTestedDevicesIsThree(){
        int[] numbers = {1,1,2,1,3};
        int result = CountTestedDevice.countTestedDevices(numbers);
        assertEquals(result, 3);
    }

    @Test
    public void testThatTestedDevicesIsTwo(){
        int[] numbers = {0, 1, 2};
        int result = CountTestedDevice.countTestedDevices(numbers);
        assertEquals(result, 2);
    }
    @Test
    public void testThatTestedDevicesIOne(){
        int[] numbers = {0, 2};
        int result = CountTestedDevice.countTestedDevices(numbers);
        assertEquals(result, 1);
    }



}