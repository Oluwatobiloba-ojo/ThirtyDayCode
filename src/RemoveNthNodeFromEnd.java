public class RemoveNthNodeFromEnd {

    public static ListNode removeNthNode(ListNode node, int index) {
        int start = 1;
        ListNode second = node;
        while (start <= index){
            start++;
            second = second.getNext();
        }
        if (second == null){
            node.setValue(node.getNext().getValue());
            node.setNext(node.getNext().getNext());
        }else {
            removeTheNthTermEnd(second, node);
        }
        return node;
    }

    private static void removeTheNthTermEnd(ListNode second, ListNode first) {
        while (second.getNext() != null) {
            second = second.getNext();
            first = first.getNext();
        }
        first.setNext(first.getNext().getNext());
    }
}
