package DSAFundamentals.LinkedList;

public class Remove_Last {
    public static Node removeLast(Node head){
        assert head != null;
        if(head.next == null)
            return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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
        System.out.print(n.data);
        System.out.print(n.next.data);
        System.out.println(n1.next.data);
        Node head = n;
        head = removeLast(head);
        var count = count(head);
        System.out.println(count);
        //System.out.println(head.data);
        System.out.print(n.data);
        System.out.print(n.next.data);
    }
}