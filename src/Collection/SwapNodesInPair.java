package Collection;
public class SwapNodesInPair {
    public static ListNode swapPairs(ListNode head) {
        var dummy = new ListNode(0);
        dummy.next = head;
        var pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            var l1 = pre.next;
            var l2 = pre.next.next;
            var next = l2.next;
            l1.next = next;
            l2.next = l1;
            pre.next = l2;
            pre = l1;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        var head = new ListNode(1);
        var cur = head;
        for (var i = 2; i <= 5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        var res = swapPairs(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
