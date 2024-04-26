import java.util.ArrayList;
import java.util.List;

public class ContainDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int count = 0; count < nums.length; count++){
            Integer duplicate = findDuplicate(nums[count], nums, count);
            if (duplicate != null) return true;
        }
        return false;
    }

    private static Integer findDuplicate(int num, int[] nums, int count) {
        for (int index = count+1; index < nums.length; index++) {
            if (nums[index] == num) return nums[index];
        }
        return null;
    }
}
