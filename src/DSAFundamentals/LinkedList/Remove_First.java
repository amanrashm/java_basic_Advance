package DSAFundamentals.LinkedList;
public class Remove_First {
    public static Node removeFirst(Node head){
        if(head == null || head.next == null)
            return null;
        head = head.next;
        return head;
    }
    public static void count(Node head){
        var count = 0;
        var temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static boolean searchInLinkedList(Node head, int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static void midOfLinkedList(Node head){
        var slow = head;
        var fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        assert slow != null;
        System.out.println("Mid of linked list: "+slow.data);
    }
    public static void main(String[] args) {
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next = n1;
        n1.next = n2;
        Node head = n;
        head = removeFirst(head);
        printLinkedList(head);
        count(head);
        if(searchInLinkedList(head, 40))
            System.out.println("Target value found in linked list");
        else
            System.out.println("Target value not found in linked list");
        midOfLinkedList(head);
    }
}