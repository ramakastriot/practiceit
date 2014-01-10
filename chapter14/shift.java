/* Write a method shift that takes a stack of integers and an integer n as 
 * parameters and that shifts n values from the bottom of the stack to the top 
 * of the stack. For example, if a variable called s stores the following 
 * sequence of values:
 *
 * bottom [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] top 
 *
 * If we make the call shift(s, 6); the method shifts the six values at the 
 * bottom of the stack to the top of the stack and leaves the other values in 
 * the same order producing:
 *
 * bottom [7, 8, 9, 10, 6, 5, 4, 3, 2, 1] top
 *
 * You are to use one queue as auxiliary storage to solve this problem. You 
 * may assume that the parameter n is >= 0 and not larger than the number of 
 * elements in the stack.
 */
public void shift(Stack<Integer> s, int n) {
    Queue<Integer> q = new LinkedList<Integer>();
    int size = s.size();
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size - n; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < n; i++)
        q.add(q.remove());
        
    while(!q.isEmpty())
        s.push(q.remove());
}
