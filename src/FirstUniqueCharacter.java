import java.util.LinkedHashMap;

public class FirstUniqueCharacter {


    public static int firstUniqueChar(String value) {
        LinkedHashMap<String, Integer> letters;
        letters = initializeChar_TimesOccuredToMap(value);
        for(String key : letters.keySet()) {
            if (letters.get(key) == 1){
               return value.indexOf(key);
            }
        }
        return -1;
    }

    private static LinkedHashMap<String, Integer> initializeChar_TimesOccuredToMap(String value) {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (int chars = 0; chars < value.length() ; chars++) {
            result.put(""+value.charAt(chars), countTimeOccured(value, value.charAt(chars)));
        }
        return result;
    }

    private static Integer countTimeOccured(String value, char c) {
        int time_occured = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == c) time_occured++;
        }
        return time_occured;
    }
}
