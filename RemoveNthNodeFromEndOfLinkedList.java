class ListNode{
    int data;
    ListNode next;

    ListNode(int data)
    {
        this.data = data;
       // this.next = null;
    }
}
public class RemoveNthNodeFromEndOfLinkedList { 
    public static void main(String[] args)
    {
        //create the input linked list 1->2->3->4->5 .. Remove 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//create two pointers fast and slow starting from head
ListNode fast = head;
ListNode slow = head;
while(fast != null && fast.next != null)
{
    slow = slow.next;//1,2,3
    fast = fast.next.next;//1,3,5

    if(slow.next != null)
    {
        slow.next = slow.next.next;
    }
}
System.out.println("Remove Nth Node from End of Linked List is : " + slow.data);  

    }
   
   
}
