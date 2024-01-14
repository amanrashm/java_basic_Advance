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
    public static int count(Node head){
        var count = 0;
        var temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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
    public static void main(String... args){
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(60);
        Node n6 = new Node(70);
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.print("Before adding: ");
        System.out.print(n.data+" ");
        System.out.print(n.next.data+" ");
        System.out.println(n1.next.data+" ");
        Node head = n;
        head = addAt(head, 60, 2);
        var count = count(head);
        System.out.println("Total count of Nodes: "+count);
        System.out.print("After adding: ");
        //System.out.println(head.data+" ");
        System.out.print(n.data+" ");
        System.out.print(n.next.data+" ");
        System.out.print(n1.next.data+" ");
        System.out.println(n2.next.data+" ");
        midOfLinkedList(head);
    }
}