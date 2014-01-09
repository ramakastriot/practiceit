/* Write a method collapse that takes a stack of integers as a parameter and 
 * that collapses it by replacing each successive pair of integers with the 
 * sum of the pair. If the stack stores an odd number of elements, the final 
 * element is not collapsed. You may use one queue as auxiliary storage.
 */
public void collapse(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    
    while(!s.isEmpty())
        q.add(s.pop());
                        
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty()) {
        int n1 = s.pop();
                                                            
        if(s.isEmpty()) {
            q.add(n1);
            break;
        }
        
        int n2 = s.pop();
        q.add(n1 + n2);
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
}
