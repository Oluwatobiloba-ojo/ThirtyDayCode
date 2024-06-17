public class ListNode {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    private ListNode next;
    public ListNode(){}

    public static ListNode deserialize(String word) {
        word = word.replaceAll("[\\[\\]\\s]", "");
        String[] values = word.split(",");
        ListNode listNode = new ListNode();
        ListNode current = listNode;
        for (String val : values) {
            current.next = new ListNode(Integer.parseInt(val));
            current = current.next;
        }
        return listNode.next;
    }


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

    public String toString(){
        StringBuilder result = new StringBuilder("[");
        ListNode listNode = this;
        while (listNode.next != null){
            result.append(listNode.value).append(",");
            listNode = listNode.next;
        }
        result.append(listNode.value).append("]");
        return result.toString();
    }


}
