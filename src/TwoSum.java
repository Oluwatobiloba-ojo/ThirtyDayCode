import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            int component = target - nums[index];
            Integer indexBefore = getMapIndexOf(component, maps);
            if (indexBefore != null){
                result[0] = indexBefore;
                result[1] = index;
            }
            else maps.put(index, nums[index]);
        }
        return result;
    }

    private static Integer getMapIndexOf(int component, Map<Integer, Integer> maps) {
        for (Integer keys : maps.keySet()) {
            if (maps.get(keys) == component) return keys;
        }
        return null;
    }
}
