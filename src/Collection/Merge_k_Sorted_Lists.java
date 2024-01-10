package Collection;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) { this.val = val; }
    ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}
public class Merge_k_Sorted_Lists {
    public static ListNode1 mergeKLists(ListNode1[] lists) {
        if(lists.length == 0) return null;
        var result = lists[0];
        for(var i = 1; i < lists.length; i++){
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }
    private static ListNode1 mergeTwoLists(ListNode1 result, ListNode1 list) {
        if(result == null) return list;
        if(list == null) return result;
        if(result.val < list.val){
            result.next = mergeTwoLists(result.next, list);
            return result;
        }
        else{
            list.next = mergeTwoLists(result, list.next);
            return list;
        }
    }
    public static void main(String [] args){
        var list1 = new ListNode1(1);
        list1.next = new ListNode1(4);
        list1.next.next = new ListNode1(5);
        var list2 = new ListNode1(1);
        list2.next = new ListNode1(3);
        list2.next.next = new ListNode1(4);
        var list3 = new ListNode1(2);
        list3.next = new ListNode1(6);
        var lists = new ListNode1[]{list1, list2, list3};
        var result = mergeKLists(lists);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
/*if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeLists(lists, 0, lists.length - 1);
    }
    private static ListNode1 mergeLists(ListNode1[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode1 left = mergeLists(lists, start, mid);
        ListNode1 right = mergeLists(lists, mid + 1, end);
        return merge(left, right);
    }
    private static ListNode1 merge(ListNode1 l1, ListNode1 l2) {
        ListNode1 dummy = new ListNode1(0);
        ListNode1 curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;*/