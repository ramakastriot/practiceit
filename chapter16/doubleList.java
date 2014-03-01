/* Write a method doubleList that doubles the size of a list by appending a 
 * copy of the original sequence to the end of the list.
 */
public void doubleList() {
    if(front == null)
        return;
        
    ListNode current = front;
    ListNode prev = front;
    ListNode copy = null;
    ListNode last = null;
    
    while(current != null) {
        ListNode n = new ListNode(current.data);
        
        if(copy == null) {
            copy = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        
        prev = current;
        current = prev.next;
    }
    
    prev.next = copy;
}
