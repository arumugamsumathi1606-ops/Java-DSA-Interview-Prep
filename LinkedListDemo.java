class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
         head.next.next.next = new Node(40);
          head.next.next.next.next = new Node(50);
          while(head != null)
          {
            System.out.print(head.data + "->");
            head = head.next;
          }
       // System.out.println("Linked List created successfully!" + head.data);
    }
    
}
