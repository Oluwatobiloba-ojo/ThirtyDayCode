import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoubleArray {


    public static int[] doubleArray(int[] nums) {
        int[] result = new int[nums.length+ nums.length];
        for (int index = 0; index < nums.length; index++) {
            result[index] = nums[index];
            result[index+nums.length] = result[index] + result[index];
        }
        return result;
    }

    public static void doubleArray2(int[] nums){
        int[] result = Arrays.stream(nums)
                .flatMap(value -> IntStream.of(value, value)).toArray();
        System.out.println(Arrays.toString(result));
        for (int index = 0; index < result.length; index+=2) {
            result[index+1] = result[index] + result[index];
        }


    }


}
