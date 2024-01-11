package DSAFundamentals.LinkedList;
public class Remove_At {
    public static Node removeAt(Node head, int index){
        assert head != null;
        if(index == 0)
            return head.next;
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
        head = removeAt(head, 1);
        System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.print(n1.next.data);
    }
}
