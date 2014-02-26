/* Write a method stretch that takes an integer n as a parameter and that 
 * increases a list of integers by a factor of n by replacing each integer in 
 * the original list with n copies of that integer.
 */
public void stretch(int n) {
    if(n <= 0)
        front = null;
        
    ListNode current = front;
    
    while(current != null) {
        int d = current.data;
        ListNode next = current.next;
        
        for(int i = 1; i < n; i++) {
            current.next = new ListNode(current.data);
            current = current.next;
        }
        
        current.next = next;
        current = next;
    }
}
