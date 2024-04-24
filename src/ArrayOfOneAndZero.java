import java.util.Arrays;

public class ArrayOfOneAndZero {

    public static int[] change(int[] input) {
        return Arrays.stream(input)
                .map(ArrayOfOneAndZero::checkEvenOrOdd)
                .toArray();
    }

    public static int checkEvenOrOdd(int number) {
        if (number % 2 == 0){
            return 0;
        }else return 1;
    }

}
