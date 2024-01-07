package Collection;
public class RemoveDuplicatesFromLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        var curr = head;
        while(curr.next != null){
            if(curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
    public static void main(String [] args){
        var head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        var result = new RemoveDuplicatesFromLinkedList().deleteDuplicates(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}