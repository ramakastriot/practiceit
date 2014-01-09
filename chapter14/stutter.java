/* Write a method stutter that takes a stack of integers as a parameter and 
 * replaces every value in the stack with two occurrences of that value. For 
 * example, suppose the stack stores these values:
 *
 * bottom [3, 7, 1, 14, 9] top
 *
 * Then the stack should store these values after the method terminates:
 *
 * bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
 *
 * You may use a single queue as auxiliary storage to solve this problem.
 */
public void stutter(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
        
    while(!s.isEmpty())
        q.add(s.pop());
                        
    while(!q.isEmpty())
        s.push(q.remove());
                                        
    while(!s.isEmpty())
        q.add(s.pop());
                                                        
    while(!q.isEmpty()) {
        int n = q.remove();
        s.push(n);
        s.push(n);
    }
}
