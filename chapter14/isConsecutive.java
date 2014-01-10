/* Write a method isConsecutive that takes a stack of integers as a parameter 
 * and that returns whether or not the stack contains a sequence of 
 * consecutive integers starting from the bottom of the stack (returning true 
 * if it does, returning false if it does not). Your method must restore the 
 * stack so that it stores the same sequence of values after the call as it 
 * did before. Any stack with fewer than two values should be considered to be 
 * a list of consecutive integers. You may use one queue as auxiliary storage 
 * to solve this problem.
 */
public boolean isConsecutive(Stack<Integer> s) {
    if(s.size() < 2)
        return true;
        
    Queue<Integer> q = new LinkedList<Integer>();
    int next = s.pop();
    q.add(next);
    boolean consecutive = true;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n + 1 != next)
            consecutive = false;
            
        next = n;
        q.add(n);
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
        
    return consecutive;
}
