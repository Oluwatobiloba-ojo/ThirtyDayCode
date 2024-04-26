import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertTrue(PalindromicLinkedList.isPalindromic(listNode));
    }


}
