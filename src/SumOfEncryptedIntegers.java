public class SumOfEncryptedIntegers {


    public static int sumUpEncrypt(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += encrypt(num);
        }
        return result;
    }

    private static int encrypt(int num) {
        String numToString = String.valueOf(num);
        String maximum = getMaximum(numToString);
        numToString = replaceAll(maximum, numToString.length());
        System.out.println(numToString);
        return Integer.parseInt(numToString);
    }

    private static String replaceAll(String maximum, int length) {
        String word = "";
        for (int i = 0; i < length; i++) {
            word += maximum;
        }
        return word;
    }

    private static String getMaximum(String numToString) {
        int max = Integer.parseInt(numToString.charAt(0)+"");
        for (int index = 1; index < numToString.length() ; index++) {
            int num = Integer.parseInt(numToString.charAt(index) + "");
            if (num > max){
                max = num;
            }
        }
        return String.valueOf(max);
    }


}
