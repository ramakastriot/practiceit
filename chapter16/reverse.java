/* Write a method reverse that reverses the order of the elements in the list.
 */
public void reverse() {
    ListNode prev = null;
    ListNode current = front;
    
    while(current != null) {
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    
    front = prev;
}
