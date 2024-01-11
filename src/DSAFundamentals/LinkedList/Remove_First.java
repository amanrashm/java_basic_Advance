package DSAFundamentals.LinkedList;
public class Remove_First {
    public static Node removeFirst(Node head){
        if(head == null || head.next == null)
            return null;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next = n1;
        n1.next = n2;
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
        Node head = n;
        head = removeFirst(head);
        System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
    }
}