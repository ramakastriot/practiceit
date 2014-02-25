/* Write a method switchPairs that switches the order of elements in a linked 
 * list of integers in a pairwise fashion. Your method should switch the order 
 * of the first two values, then switch the order of the next two, switch the 
 * order of the next two, and so on. If there are an odd number of values, the 
 * final element is not moved.
 */
public void switchPairs() {
    if(front == null || front.next == null)
        return;
        
    ListNode first = front;
    ListNode second = first.next;
    first.next = second.next;
    second.next = first;
    front = second;
    
    ListNode n = first;
    while(n.next != null) {
        first = n.next;
        second = first.next;
        
        if(second == null)
            return;
            
        first.next = second.next;
        second.next = first;
        n.next = second;
        n = first;
    }
}
