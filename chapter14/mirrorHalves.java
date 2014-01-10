/* Write a method mirrorHalves that accepts a queue of integers as a parameter 
 * and replaces each half of that queue with itself plus a mirrored version of 
 * itself (the same elements in the opposite order). If your method is passed 
 * an empty queue, the result should be an empty queue. If your method is 
 * passed a null queue or one whose size is not even, your method should throw 
 * an IllegalArgumentException. You may use one stack or one queue (but not 
 * both) as auxiliary storage to solve this problem. Your code must run in 
 * O(n) time where n is the number of elements of the original queue.
 */
public void mirrorHalves(Queue<Integer> q) {
    if(q == null || q.size() % 2 == 1)
        throw new IllegalArgumentException();
        
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();

    // Nested loops but still O(n) time since the outer loop does not depend
    // on the size of the queue
    for(int k = 0; k < 2; k++) {
        for(int i = 0; i < size / 2; i++) {
            int n = q.remove();
            q.add(n);
            s.push(n);
        }
        
        while(!s.isEmpty())
            q.add(s.pop());
    }
}
