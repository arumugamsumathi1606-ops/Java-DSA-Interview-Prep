class Node {
    int data;
    Node next;
    //Constructor
    Node(int Data)
    {
        this.data = data;
    }
}   
    public class CycleDetectionLinkedList {
        public static void main(String[] args) {
            
            //Create Obj and add data to Linked List
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50); //10-20-30-40-50
            head.next.next.next.next = head.next; //50->20 creating cycle in linked list
            //Create two pointers
            Node slow = head; 
            Node fast = head;
            //Loop to ensure fast is not null as moving faster
            while(fast !=null && fast.next != null)
            {
                slow = slow.next; //1 move
                fast = fast.next.next; //2 moves
                //Loop to compare the two pointers meet each other or not
                if (slow==fast)
                {
                    System.out.println("Cycle exists!!!" + slow.data);
                    return;
                }
                System.out.println("Cycle does not exists!!!");
            }
        }
    }

