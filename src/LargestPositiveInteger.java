import java.util.Arrays;

public class LargestPositiveInteger {

    public static int findMaxK(int[] nums) {
        int max = Arrays.stream(nums).max().orElse(-1);
        while (max != -1 && max != 0) {
            int count = 0;
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] == -max) return max;
                if (nums[index] == max) count = index;
            }
            max = Arrays.stream(nums).max().orElse(-1);
            nums[count] = 0;
        }
        if (max == 0) return -1;
        return max;
    }
}
