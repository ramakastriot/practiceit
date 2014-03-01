/* Write a method shift that rearranges the elements of a list of integers by 
 * moving to the end of the list all values that are in odd-numbered positions 
 * and otherwise preserving list order.
 */
public void shift() {
    if(front == null)
        return;
        
    ListNode evens = null;
    ListNode lastEvens = null;
    ListNode odds = null;
    ListNode lastOdds = null;
    ListNode current = front;
    int i = 0;
    
    while(current != null) {
        if(i % 2 == 0) {
            if(evens == null) {
                evens = current;
                lastEvens = current;
            } else {
                lastEvens.next = current;
                lastEvens = current;
            }   
            current = current.next;
            lastEvens.next = null;
        } else {
            if(odds == null) {
                odds = current;
                lastOdds = current;
            } else {
                lastOdds.next = current;
                lastOdds = current;
            }
            current = current.next;
            lastOdds.next = null;
        }
        
        i++;
    }
    
    front = evens;
    lastEvens.next = odds;
}
