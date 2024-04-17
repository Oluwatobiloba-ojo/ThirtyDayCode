import java.util.HashMap;
import java.util.Map;

public class SubstringPresent {


    public static boolean isSubstringPresent(String word) {
        String reverse = reverse(word);
        Map<Integer, String> subString = getSubString(word);
        return checkReverseSubstring(subString, reverse);
    }

    private static boolean checkReverseSubstring(Map<Integer, String> subString, String reverse) {
        for (int index = 0; index < reverse.length()-1; index++) {
            if (checkWordInSubString(subString, reverse.charAt(index) +""+reverse.charAt(index+1))){
                return true;
            }
        }
        return false;
    }

    private static boolean checkWordInSubString(Map<Integer, String> subString, String word) {
        return subString.values().stream().toList().contains(word);
    }

    private static Map<Integer, String> getSubString(String word) {
        Map<Integer, String> words = new HashMap<>();
        for (int index = 0; index < word.length() -1; index++) {
            words.put(index, word.charAt(index)+"" + word.charAt(index+1));
        }
        return words;
    }

    private static String reverse(String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
