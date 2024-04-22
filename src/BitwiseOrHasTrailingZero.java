public class BitwiseOrHasTrailingZero {


    public static boolean hasTrailingZero(int[] nums) {
        int even = 0;
        for (int num: nums) {
            if (num % 2 == 0){
                even ++;
            }
        }
        return even >= 2;
    }
}
