/* Write a method removeAll that removes all occurrences of a particular value.
 * If the list is empty or the value doesn't appear in the list at all, then 
 * the list should not be changed by your method. You must preserve the 
 * original order of the elements of the list.
 */
public void removeAll(int val) {
    ListNode prev = null;
    ListNode current = front;
    
    while(current != null) {
        if(current.data == val) {
            if(prev == null) {
                front = current.next;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        } else {
            prev = current;
            current = prev.next;
        }
    }
}
