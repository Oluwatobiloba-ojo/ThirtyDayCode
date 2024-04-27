import java.util.ArrayList;
import java.util.List;

public class RemoveKDigit {
    public static String removeKDigits(String nums, int k) {
        if (k >= nums.length()) return "0";
        List<Integer> num = new ArrayList<>();
        for (int count = 0; count <= nums.length()-k; count++) {
            num.add(getDigit(count, k, nums));
        }
        return minimumValue(num);
    }

    private static String minimumValue(List<Integer> num) {
        return String.valueOf(num.stream().sorted().findFirst().orElse(0));
    }

    private static Integer getDigit(int count, int k, String nums) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < nums.length(); index++){
            if (index == count){
                index += k-1;
                continue;
            }
            builder.append(nums.charAt(index));
        }
       return Integer.parseInt(builder.toString());
    }
}
