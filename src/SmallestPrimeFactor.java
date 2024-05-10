import java.util.ArrayList;
import java.util.List;

public class SmallestPrimeFactor {


    public static int[] kthSmallestPrimeFactor(int[] numbers, int constant) {
        int[] result = new int[2];
        List<String> values = new ArrayList<>();
        for (int count = 0; count < numbers.length; count++){
            getFraction(count, numbers, numbers[count], values);
        }
        String[] results = values.get(constant-1).split("/");
        System.out.println(values);
        result[0] = Integer.parseInt(results[0]);
        result[1] = Integer.parseInt(results[1]);
        return result;
    }

    private static void getFraction(int index, int[] numbers, int value, List<String> values) {
        for (int count = numbers.length-1; count > index; count-- ){
            if(count == numbers.length-1 && !values.isEmpty()){
                String[] former = values.get(values.size()-1).split("/");
                double val = (double) Integer.parseInt(former[0]) / Integer.parseInt(former[1]);
                if (val > (double) value / numbers[count]){
                    values.add(values.size()-1, value+"/"+numbers[count]);
                }else values.add(value+"/"+numbers[count]);
                continue;
            }
            values.add(value+"/"+numbers[count]);
        }
    }
}
