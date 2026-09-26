class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
    }
}
public class MergedTwoSortedLikedList {
public static void main(String[] args)
{     //Create two sorted linked lists l1 = 1,3,5 and l2 = 2,4,6
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(3);
    l1.next.next = new ListNode(5);
    //list 2 to compare with list 1
     ListNode l2 = new ListNode(2);
    l2.next = new ListNode(4);
    l2.next.next = new ListNode(6);
 //Add dummy node to store the starting node as 0
    ListNode dummy = new ListNode(0);
    ListNode current = dummy; // 0
    //Compare the two lists and merge them
    while (l1 != null && l2 != null) {
        if (l1.data < l2.data) {
            current.next = l1; //0
            l1 = l1.next; //1
        } else {
            current.next = l2;//0
            l2 = l2.next;//2
        }
        current = current.next; // to move the current pointer to the next node in the merged list,
        // 5 is the last node in the list1 then I manually move the node to list2 to save teh last data = 6
    }
    // Append any remaining nodes from either list
    if (l1 != null) {
        current.next = l1;
    } else {
        current.next = l2;
    }
    // Print the merged list
    current = dummy.next; // Move current to the start of the merged list
while (current != null) {
        System.out.print(current.data + " ->");
        current = current.next;
}
}
}
