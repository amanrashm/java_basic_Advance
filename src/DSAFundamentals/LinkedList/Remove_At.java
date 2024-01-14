package DSAFundamentals.LinkedList;
public class Remove_At {
    public static Node removeAt(Node head, int index){
        assert head != null;
        if(index == 0)
            return head.next;
        Node temp = head;
        for(int i = 1; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
    public static void main(String... args){
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next = n1;
        n1.next = n2;
        Node head = n;
        head = removeAt(head, 0);
        printLinkedList(head);
        var count = count(head);
        System.out.println(count);
        if(searchInLinkedList(head, 40))
            System.out.println("Target value found in linked list");
        else
            System.out.println("Target value not found in linked list");
    }
}