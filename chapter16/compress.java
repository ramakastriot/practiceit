/* Write a method compress that could be added to the LinkedIntList class, 
 * that accepts an integer n representing a "compression factor" and replaces 
 * every n elements with a single element whose data value is the sum of those 
 * n nodes. If the list's size is not an even multiple of n, whatever elements 
 * are left over at the end are compressed into one node. If n is greater than 
 * or equal to the list size, the entire list compresses into a single element.
 * If the list is empty, the result after the call is empty regardless of what 
 * factor n is passed. You may assume that the value passed for n is >= 1.
 */
public void compress(int n) {
    if(front == null)
        return;
        
    ListNode current = front;
    ListNode runner = current;
    int i = 0;
    int sum = 0;
    
    while(current != null) {
        if(i < n && runner != null) {
            sum += runner.data;
            runner = runner.next;
            i++;
        } else {
            current.data = sum;
            current.next = runner;
            current = runner;
            sum = 0;
            i = 0;
        }
    }
}
