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
    public static int count(Node head){
        var count = 0;
        var temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next = n1;
        n1.next = n2;
        System.out.print("Before adding: ");
        System.out.print(n.data+" ");
        System.out.print(n.next.data+" ");
        System.out.println(n1.next.data+" ");
        Node head = n;
        head = addFirst(head, 50);
        System.out.print("After adding: ");
        System.out.print(head.data+" ");
        System.out.print(n.data+" ");
        System.out.print(n.next.data+" ");
        System.out.println(n1.next.data+" ");
        var count = count(head);
        System.out.println("Total count of Nodes: "+count);
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