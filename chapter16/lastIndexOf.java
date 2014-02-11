/* Write a method lastIndexOf that accepts an integer value as a parameter and 
 * that returns the index in the list of the last occurrence of that value, 
 * or -1 if the value is not found in the list.
 */
public int lastIndexOf(int val) {
    ListNode current = front;
    int index = -1;
    int i = 0;
    
    while(current != null) {
        if(current.data == val)
            index = i;
            
        current = current.next;
        i++;
    }
    
    return index;
}
