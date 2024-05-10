import java.util.ArrayList;
import java.util.List;

public class SmallestPrimeFactor {


    public static int[] kthSmallestPrimeFactor(int[] numbers, int constant) {
        int[] result = new int[2];
        List<String> values = new ArrayList<>();
        for (int count = 0; count < numbers.length; count++){
            getFraction(count, numbers, numbers[count], values);
        }
        String[] results = values.get(constant).split("/");
        System.out.println(values);
        result[0] = Integer.parseInt(results[0]);
        result[1] = Integer.parseInt(results[1]);
        return result;
    }

    private static List<String> getFraction(int index, int[] numbers, int value, List<String> values) {
        for (int count = numbers.length-1; count > index; count-- ){
            if(count == numbers.length && !values.isEmpty()){
                String[] former = values.get(values.size()-1).split("/");
                if (Integer.parseInt(former[0])/Integer.parseInt(former[1]) > value / count){
                    values.add(values.size()-1, value+"/"+count);
                }else values.add(value+"/"+count);
                continue;
            }
            values.add(value+"/"+count);
        }
        return values;
    }


}
