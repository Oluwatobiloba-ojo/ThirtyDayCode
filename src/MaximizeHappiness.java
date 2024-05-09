import java.util.Arrays;

public class MaximizeHappiness {

    public static long maximumHappinessSum(int[] happiness, int constant) {
        long result = 0;
        int count = 0;
        happiness = Arrays.stream(happiness).sorted().toArray();
        for (int index = happiness.length-1; index >=  happiness.length-constant; index--) {
            int maximum = Math.max(happiness[index] - count, 0);
            result += maximum;
            count++;
        }
        return result;
    }
}
