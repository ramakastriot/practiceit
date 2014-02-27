/* Write a method removeEvens that removes the values in even-numbered indexes 
 * from a list, returning a new list containing those values in their original 
 * order. You are not allowed to create any new nodes or to change the values 
 * stored in data fields to solve this problem; You must solve it by 
 * rearranging the links of the list.
 */
public LinkedIntList removeEvens() {
    LinkedIntList evens = new LinkedIntList();
    
    if(front == null)
        return evens;
        
    evens.front = front;
    ListNode last = evens.front;
    front = front.next;
    ListNode prev = null;
    ListNode current = front;
    int i = 1;
    
    while(current != null) {
        if(i % 2 == 0) {
            last.next = current;
            last = current;
            prev.next = current.next;
            current = current.next;
            last.next = null;
        } else {
            prev = current;
            current = prev.next;
        }
        
        i++;
    }
    
    return evens;
}
