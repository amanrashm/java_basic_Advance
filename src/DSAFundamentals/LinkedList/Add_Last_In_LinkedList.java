package DSAFundamentals.LinkedList;
public class Add_Last_In_LinkedList {
    public static Node addLast(Node head, int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
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
        Node head = null;
        head = addLast(head, 50);
        System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
    }
}
