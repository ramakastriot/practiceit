/* Write a method min that returns the minimum value in a list of integers. If 
 * the list is empty, it should throw a NoSuchElementException.
 */
public int min() {
    if(front == null)
        throw new NoSuchElementException();
        
    int m = front.data;
    ListNode n = front.next;
    
    while(n != null) {
        if(n.data < m)
            m = n.data;
        
        n = n.next;
    }
    
    return m;
}
