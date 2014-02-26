/* Write a method transferFrom that accepts a second LinkedIntList as a 
 * parameter and that moves values from the second list to this list. You are 
 * to attach the second list's elements to the end of this list. You are also 
 * to empty the second list. Either of the two lists could be empty, but you 
 * can assume that neither list is null. You are not to create any new nodes. 
 * Your method should simply change links of the lists to join them together.
 */
public void transferFrom(LinkedIntList second) {
    if(front == null) {
        front = second.front;
        second.front = null;
        return;
    }
    
    ListNode last = front;
    
    while(last.next != null)
        last = last.next;
        
    last.next = second.front;
    second.front = null;
}
