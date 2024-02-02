import java.util.ArrayList;
import java.util.List;

public class ReversePolishNotation {

    public static int evalRPM(String[] input) {
        List<String> result = new ArrayList<>();
        for (int count = 0; count < input.length; count++){
            if (input[count].equals("-") || input[count].equals("+") || input[count].equals("*") || input[count].equals("/") || input[count].equals("%")){
                result.add(input[count]);
                solveExpression(input[count], result);
            }
            else result.add(input[count]);
        }
        return Integer.parseInt(result.get(0));
    }

    private static void solveExpression(String value, List<String> result) {
        int indexOfOperator = result.indexOf(value);
        int number = 0;
        String firstValueOfOperator = result.remove(indexOfOperator - 1);
        String secondValueOfOperator = result.remove(indexOfOperator - 2);
        int firstValue = changeValueToInt(firstValueOfOperator);
        int secondValue = changeValueToInt(secondValueOfOperator);
        if (value.equals("+")) number = secondValue + firstValue;
        else if (value.equals("-")) number = secondValue - firstValue;
        else if (value.equals("*")) number = secondValue * firstValue;
        else if (value.equals("/")) number = secondValue / firstValue;
        else if (value.equals("%")) number = secondValue % firstValue;
        result.remove(value);
        result.add(String.valueOf(number));
    }

    private static int changeValueToInt(String firstValueOfOperator) {
        if (!firstValueOfOperator.contains("-")) return Integer.parseInt(firstValueOfOperator);
        else{
            String copiedValue = "";
            for (int index = 1; index < firstValueOfOperator.length() ; index++) {
                copiedValue += firstValueOfOperator.charAt(index);
            }
            return -Integer.parseInt(copiedValue);
        }
    }

}