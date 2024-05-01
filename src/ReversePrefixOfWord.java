public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch))) return word;
        int index_of_character = word.indexOf(ch);
        String substring = word.substring(0, index_of_character+1);
        StringBuilder builder = new StringBuilder(substring);
        builder.reverse();
        builder.append(word.substring(index_of_character+1));
        return builder.toString();
    }
}
