public class DeleteNodeInLinkedList {


    public static void deleteNode(ListNode node) {
        while (node.getNext() != null) {
            node.setNext(node.getNext());
            node.setValue(node.getNext().getValue());
            node = node.getNext();
        }
        node.setNext(null);
        node.setValue(node.getValue());
    }
}
