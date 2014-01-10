/* Write a method mirror that accepts a stack of integers as a parameter and 
 * replaces the stack contents with itself plus a mirrored version of itself 
 * (the same elements in the opposite order). Note that the mirrored version 
 * is added on to the top of what was originally in the stack. The bottom half 
 * of the stack contains the original numbers in the same order. If your 
 * method is passed an empty stack, the result should be an empty stack. If 
 * your method is passed a null stack, your method should throw an 
 * IllegalArgumentException. You may use one stack or one queue (but not both) 
 * as auxiliary storage to solve this problem. Your code must run in O(n) time 
 * where n is the number of elements of the original stack.
 */
public void mirror(Stack<Integer> s) {
    if(s == null)
        throw new IllegalArgumentException();
        
    Queue<Integer> q = new LinkedList<Integer>();
    int size = s.size();
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        s.push(n);
        q.add(n);
    }
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size; i++)
        q.add(q.remove());
        
    while(!q.isEmpty())
        s.push(q.remove());
}
