/* Write a method reverseFirstK that accepts an integer k and a queue of 
 * integers as parameters and reverses the order of the first k elements of 
 * the queue, leaving the other elements in the same relative order. If k is 0 
 * or negative, no change should be made to the queue. If the queue passed is 
 * null or does not contain at least k elements, your method should throw an 
 * IllegalArgumentException. You may use one queue or stack (but not both) as 
 * auxiliary storage.
 */
public void reverseFirstK(int k, Queue<Integer> q) {
    if(q == null || k > q.size())
        throw new IllegalArgumentException();
        
    if(k <= 0)
        return;
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    
    for(int i = 0; i < k; i++)
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < size - k; i++)
        q.add(q.remove());
}
