package DSAFundamentals.LinkedList;
public class Add_First_In_LinkedList {
    public static Node addFirst(Node head, int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return head;
        }
        n.next = head;
        head = n;
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
        head = addFirst(head, 50);
        System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}