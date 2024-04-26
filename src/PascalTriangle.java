import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static List<List<Integer>> generate(int numsRow) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num = 0; num < numsRow; num++) {
            if (num == 0) result.add(List.of(1));
            else if (num == 1) result.add(List.of(1, 1));
            else {
                List<Integer> nums = getNextPascal(result);
                result.add(nums);
            }
        }
        return result;
    }

    private static List<Integer> getNextPascal(List<List<Integer>> result) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> formerList = result.get(result.size() - 1);
        for (int count = 0; count <= formerList.size(); count++) {
            if (count == 0) nums.add(1);
            else if (count == formerList.size()) nums.add(1);
            else {
                int former = formerList.get(count);
                int formerSecond = formerList.get(count - 1);
                nums.add(formerSecond + former);
            }
        }
        return nums;
    }
}
