/* Write a method stutter that doubles the size of a list by replacing every 
 * integer in the list with two of that integer.
 */
public void stutter() {
    if(front == null)
        return;
        
    ListNode current = front;
    
    while(current != null) {
        ListNode n = new ListNode(current.data);
        n.next = current.next;
        current.next = n;
        current = n.next;
    }
}
