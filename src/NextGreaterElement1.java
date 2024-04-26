import java.util.Arrays;
import java.util.List;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
                .map(value -> checkGreaterByTheLeft(value, nums2))
                .toArray();
    }

    private static int checkGreaterByTheLeft(int value, int[] nums2) {
       List<Integer> nums =  Arrays.stream(nums2).boxed().toList();

       int indexOfValue = nums.indexOf(value);
       if (indexOfValue == nums.size()-1) return -1;
       if (nums.get(indexOfValue+1) > value ){
           return nums.get(indexOfValue+1);
       }else return -1;
    }
}
