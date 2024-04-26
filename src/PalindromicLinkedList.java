public class PalindromicLinkedList {

    public static boolean isPalindromic(ListNode listNode) {
        StringBuilder builder = new StringBuilder();
        while (listNode.getNext() != null){
            builder.append(listNode.getValue());
            listNode = listNode.getNext();
        }
        builder.append(listNode.getValue());
        String word = builder.toString();
        return word.contentEquals(builder.reverse());
    }
}
