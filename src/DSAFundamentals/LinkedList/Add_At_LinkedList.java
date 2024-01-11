package DSAFundamentals.LinkedList;
import static DSAFundamentals.LinkedList.Add_First_In_LinkedList.addFirst;
public class Add_At_LinkedList {
    public static Node addAt(Node head, int data, int index){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return head;
        }
        if(index == 0)
            addFirst(head, data);
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        return head;
    }
    public static void main(String... args){
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next = n1;
        n1.next = n2;
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
        Node head = n;
        head = addAt(head, 60, 3);
        System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
        System.out.print(n2.next.data);
    }
}