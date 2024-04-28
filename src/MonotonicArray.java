import java.util.Arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        return Arrays.equals(nums, Arrays.stream(nums).sorted().toArray()) ||
                (Arrays.stream(nums).boxed().toList().equals(Arrays.stream(nums).boxed().sorted(MonotonicArray::descending).toList()));
    }

    private static int descending(Integer x, Integer y) {
        if (x > y) return -1;
        else if (x < y) return 1;
        else return 0;
    }
}
