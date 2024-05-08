import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeInLinkedListTest {

    @Test
    public void testThatRemoveNodeOfARootNodeInLinkedList(){
        ListNode listNode = ListNode.deserialize("[4,5,1,9]");
        ListNode node = listNode.getNext();
        DeleteNodeInLinkedList.deleteNode(node);
        System.out.println(listNode);
        assertEquals(1, listNode.getNext().getValue());
    }
    @Test
    public void testThatRemoveNode1OfARootNodeInLinkedList(){
        ListNode listNode = ListNode.deserialize("[4,5,1,9]");
        ListNode node = listNode.getNext().getNext();
        DeleteNodeInLinkedList.deleteNode(node);
        System.out.println(listNode);
        assertEquals(9, listNode.getNext().getNext().getValue());
    }

}