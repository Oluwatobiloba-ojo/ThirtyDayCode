import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndTest {

    @Test
    public void testFromALinkedNodeFromTheEndWithIndex4(){
        String serialize = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
        int index = 4;
        ListNode node = ListNode.deserialize(serialize);
        ListNode resultNode = RemoveNthNodeFromEnd.removeNthNode(node, index);
        assertEquals(resultNode, ListNode.deserialize("[0, 1, 2, 3, 4, 5, 7, 8, 9]"));
    }
    @Test
    public void testFromALinkedNodeFromTheEndWith2Index4(){
        String serialize = "[0, 1, 2, 3]";
        int index = 4;
        ListNode node = ListNode.deserialize(serialize);
        ListNode resultNode = RemoveNthNodeFromEnd.removeNthNode(node, index);
        assertEquals(resultNode, ListNode.deserialize("[1, 2, 3]"));
    }

}