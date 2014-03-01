/* Write a method rotate that moves the value at the front of a list of 
 * integers to the end of the list. The other values in the list should retain 
 * the same order as in the original list. If the method is called for a list 
 * of 0 or 1 elements it should have no effect on the list.
 */
public void rotate() {
    if(front == null)
        return;
        
    ListNode last = front;
    
    while(last.next != null)
        last = last.next;
        
    last.next = front;
    front = front.next;
    last.next.next = null;
}
