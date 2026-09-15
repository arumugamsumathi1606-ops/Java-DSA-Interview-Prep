//input10->20->30->40->50 output 50->40->30->20->10
class Node {
    int data; //10,20,30,40,50
    Node next;
//Create Constructor
Node(int data) {
    this.data = data;
}
}

    public class ReversedLinkedList {
        public static void main(String[] args)
    {
        // create obj and data into LL
        Node head = new Node(10); //10
        head.next = new Node(20); //10 -> 20
        head.next.next = new Node(30); //10 -> 20 -> 30
        head.next.next.next = new Node(40); //10 -> 20 -> 30 -> 40
        head.next.next.next.next = new Node(50); //10 -> 20 -> 30 -> 40 -> 50
        // Call the reverse method
         Node previous = null; //10 -> 20 -> 30 -> 40 -> 50 -> null
         Node Current = head; //10
         while(Current != null)
         {
            Node next = Current.next;// previous = null, Current = 10, current.next = 20
            Current.next = previous; //   null <-10 <-20
            previous = Current; // previous = 10
            Current = next; // Current = 20
         }
            head = previous; // Update head to the new first node 50
         while(head != null)
         {
            System.out.print(head.data + "->");
            head = head.next;
              
        //  System.out.println("Reversed Linked List is : " + head.data); //50
        //  //System.out.println("Next node is : " + head.next);
        }
}
    }