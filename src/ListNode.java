public class ListNode {
    private int value;
    private ListNode next;
    public ListNode(){}
    public int getValue() {
        return value;
    }
    public ListNode getNext() {
        return next;
    }
    public ListNode(int value){
        this.value = value;
    }
    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }

}
