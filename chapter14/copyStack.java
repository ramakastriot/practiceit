/* Write a method copyStack that takes a stack of integers as a parameter and 
 * returns a copy of the original stack (i.e., a new stack with the same 
 * values as the original, stored in the same order as the original). Your 
 * method should create the new stack and fill it up with the same values that 
 * are stored in the original stack. It is not acceptable to return the same 
 * stack passed to the method; you must create, fill, and return a new stack. 
 * You may use one queue as auxiliary storage.
 */
public Stack<Integer> copyStack(Stack<Integer> s1) {
    Stack<Integer> s2 = new Stack<Integer>();
    Queue<Integer> q = new LinkedList<Integer>();
            
    while(!s1.isEmpty())
        s2.push(s1.pop());
                            
    while(!s2.isEmpty())
        q.add(s2.pop());
                                            
    while(!q.isEmpty()) {
        int n = q.remove();
        s1.push(n);
        s2.push(n);
    }
    
    return s2;
}
