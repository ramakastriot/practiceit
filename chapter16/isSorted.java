/* Write a method isSorted that returns true if the list is in sorted 
 * (nondecreasing) order and returns false otherwise. An empty list is 
 * considered to be sorted.
 */
public boolean isSorted() {
    if(front == null)
        return true;
        
    ListNode prev = front;
    ListNode current = prev.next;
    
    while(current != null) {
        if(prev.data > current.data)
            return false;
            
        prev = current;
        current = prev.next;
    }
    
    return true;
}
