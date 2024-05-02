public class RemoveKDigit {

    public static String removeKDigits2(String value, int k) {
        StringBuilder builder = new StringBuilder();
        for (int count = 0; count < value.length(); count++){
            if (!builder.isEmpty()) {
                int digit = Integer.parseInt("" +(builder.charAt(builder.length()-1)));
                while (digit > Integer.parseInt(value.charAt(count)+"") && k > 0 && !builder.isEmpty()) {
                    k = deleteChar(k, builder);
                    if (!builder.isEmpty())digit = Integer.parseInt(""+builder.charAt(builder.length()-1));
                }
            }
            builder.append(value.charAt(count));
        }
        while (k > 0){
            k = deleteChar(k, builder);
        }
        if (builder.isEmpty()) return "0";
        while (builder.length() > 1 && builder.charAt(0) == '0'){
            builder.deleteCharAt(0);
        }
       return builder.toString();
    }

    private static int deleteChar(int k, StringBuilder builder) {
        builder.deleteCharAt(builder.length() - 1);
        return k-1;
    }
}
