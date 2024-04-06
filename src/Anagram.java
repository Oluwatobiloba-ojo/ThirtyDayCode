import java.util.Map;
import java.util.stream.Collectors;


public class Anagram {
    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) return false;
        else return count(first).equals(count(second));
    }

    public static Map<String, Integer> count(String first) {
       return removeDuplicate(first).chars()
               .mapToObj(Character::toString)
               .collect(Collectors.toMap(s-> s, s -> countChars(first, s)));
    }

    public static String removeDuplicate(String first) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int count = 0; count < first.length(); count++) {
            if (stringBuilder.indexOf(String.valueOf(first.charAt(count))) == -1){
                stringBuilder.append(first.charAt(count));
            }
        }
        return new String(stringBuilder);
    }


    static int countChars(String first, String s) {
        return (int) first.chars()
                .mapToObj(Character :: toString)
                .filter(value -> value.equals(s))
                .count();
    }

}