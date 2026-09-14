//Hint : Approach/ Pattern : Slow/Fast 
class Node {
    int data;
    Node next;
//Create Constructor
Node(int data) {
    this.data = data;
    }
}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
  //Create Obj and add data to Linked List
Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
head.next.next.next = new Node(40);
head.next.next.next.next = new Node(50); //10-20-30-40-50
//Create two pointers
Node fast = head; Node slow = head;
//Loop
while(fast != null && fast.next != null)
{
slow = slow.next;
fast = fast.next.next;
}
//Print the middle element
System.out.println("Middle Element of Linked List is : " + slow.data);

    }
}