/* Write a method split that rearranges the elements of a list so that all of 
 * the negative values appear before all of the non-negatives.
 */
public void split() {
    if(front == null)
        return;
        
    ListNode current = front;
    ListNode neg = null;
    ListNode pos = null;
    ListNode negLast = null;
    
    while(current != null) {
        ListNode next = current.next;
        
        if(current.data < 0) {
            current.next = neg;
            neg = current;
            if(neg.next == null)
                negLast = neg;
        } else {
            current.next = pos;
            pos = current;
        }
        
        current = next;
    }
    
    if(neg == null) {
        front = pos;
    } else {
        negLast.next = pos;
        front = neg;
    }
}
