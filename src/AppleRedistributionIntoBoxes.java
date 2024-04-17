import java.util.Arrays;
import java.util.Comparator;

public class AppleRedistributionIntoBoxes {


    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sumOfApple = Arrays.stream(apple).sum();
        capacity = comparator(capacity);
        int output = 0;
        for (int index = 0; index < capacity.length; index++) {
            output += capacity[index];
            if (output >= sumOfApple){
                return index+1;
            }
        }
        return 0;
    }

    public static int[] comparator(int[] numbers){
        Comparator<Integer> comparator = AppleRedistributionIntoBoxes::shuffleDescending;
        return Arrays.stream(numbers)
                .boxed()
                .sorted(comparator)
                .mapToInt(value -> value)
                .toArray();
    }


    public static int shuffleDescending(Integer y, Integer x){
            if (y > x) return -1;
            else if (x > y) return 1;
            return 0;
    }

}
