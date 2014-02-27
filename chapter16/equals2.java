/* Write a method equals2 that accepts a second list as a parameter and that 
 * returns true if the two lists are equal and that returns false otherwise. 
 * Two lists are considered equal if they store exactly the same values in 
 * exactly the same order and have exactly the same length.
 */
public boolean equals2(LinkedIntList second) {
    ListNode n1 = front;
    ListNode n2 = second.front;
    
    while(n1 != null || n2 != null) {
        if(n1 == null)
            return false;
            
        if(n2 == null)
            return false;
            
        if(n1.data != n2.data)
            return false;
            
        n1 = n1.next;
        n2 = n2.next;
    }
    
    return true;
}
