public class CountTestedDevice {

    public static int countTestedDevices(int[] batteryPercentages) {
        int result = 0;
        for(int num = 0; num < batteryPercentages.length; num++){
            if (batteryPercentages[num] - result > 0){
                result += 1;
            }
        }
        return result;
    }
}
