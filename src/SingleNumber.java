import java.util.Arrays;

public class SingleNumber {


    public static int isPalindrome(int[] nums) {
        return Arrays.stream(nums)
                .filter(x -> filterDuplicate(x, nums))
                .findFirst().orElse(0);
    }

    private static boolean filterDuplicate(int x, int[] nums) {
        int count = 0;
        for (int value: nums) {
            if (value == x) count++;
        }
        if (count >= 2) return false;
        else return true;
    }
}
