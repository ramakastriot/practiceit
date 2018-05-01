/* Write a method removeRange that accepts a starting and ending index as parameters 
* and removes the elements at those indexes (inclusive) from the list.
* You should throw an IllegalArgumentException if either of the positions is negative.
*/
public void removeRange(int min, int max){
    if(max < 0 || min < 0) throw new IllegalArgumentException();
    
    ListNode current = front;
    ListNode prev = front;
    
    int index = 0;
    while(current != null){
        if(index <= max && index >= min){
            current = current.next;
            if(min == 0)
                front = current;
            else
                prev.next = current;
        }else{
            prev = current;
            current = current.next;
        }
        index++;
    }
}
