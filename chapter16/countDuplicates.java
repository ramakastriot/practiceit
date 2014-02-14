/* Write a method countDuplicates that returns the number of duplicates in a 
 * sorted list. The list will be in sorted order, so all of the duplicates 
 * will be grouped together.
 */
public int countDuplicates() {
    if(front == null)
        return 0;
        
    int total = 0;
    ListNode prev = front;
    ListNode current = prev.next;
    int count = 0;
    
    while(current != null) {
        if(current.data == prev.data) {
            count++;
        } else {
            total += count;
            count = 0;
        }
        
        prev = prev.next;
        current = prev.next;
    }
    
    total += count;
    return total;
}
