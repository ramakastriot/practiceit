/* Write a method interleave that accepts a queue of integers as a parameter 
 * and rearranges the elements by alternating the elements from the first half 
 * of the queue with those from the second half of the queue. Your method 
 * should throw an IllegalArgumentException if the queue does not have even 
 * size. You may use one stack as auxiliary storage to solve this problem. 
 * Your solution must run in O(n) time, where n represents the size of the 
 * queue.
 */
public void interleave(Queue<Integer> q) {
    if(q.size() % 2 != 0)
        throw new IllegalArgumentException();
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    
    for(int i = 0; i < size / 2; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size / 2; i++)
        s.push(q.remove());
        
    while(!s.isEmpty()) {
        q.add(s.pop());
        q.add(q.remove());
    }
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
}
