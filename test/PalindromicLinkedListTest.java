import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromicLinkedListTest {

    @Test
    public void testThatPalindromicLinkedListReturnTrueCausesItIsPalindrome() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertTrue(PalindromicLinkedList.isPalindromic(listNode));
    }
    @Test
    public void testThatPalindromicLinkedListReturnFalseCausesItIsNotPalindrome(){
        ListNode listNode = new ListNode(1, new ListNode(2));
        assertFalse(PalindromicLinkedList.isPalindromic(listNode));
    }
    @Test
    public void testThatPalindromicLinkedListReturnTrueForZeroValue(){
        ListNode listNode = new ListNode(0);
        assertTrue(PalindromicLinkedList.isPalindromic(listNode));
    }
    @Test
    public void testThatPalindromicLinkedListReturnTrueFor1616Value(){
        ListNode listNode = new ListNode(1, new ListNode(6, new ListNode(1, new ListNode(6))));
        assertFalse(PalindromicLinkedList.isPalindromic(listNode));
    }
    @Test
    public void testThatPalindromicLinkedListReturnTrueFor16661Value(){
        ListNode listNode = new ListNode(1, new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(1)))));
        System.out.println(listNode);
        assertTrue(PalindromicLinkedList.isPalindromic(listNode));
    }
    @Test
    public void testDeserializeStringToAList(){
        String word = "[1,2,3,4,5]";
        ListNode node = ListNode.deserialize(word);
        assertNotNull(node);
    }


}
