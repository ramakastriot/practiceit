/* Write a method reorder that takes a queue of integers as a parameter and 
 * that puts the integers into sorted (nondecreasing) order assuming that the 
 * queue is already sorted by absolute value. Notice that the values appear in 
 * sorted order if you ignore the sign of the numbers. You may use one stack 
 * as auxiliary storage to solve this problem.
 */
public void reorder(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    int count = 0;
    
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        
        if(n < 0) {
            s.push(n);
        } else {
            q.add(n);
            count++;
        }
    }
    
    while(!s.isEmpty())
        q.add(s.pop());
        
    for(int i = 0; i < count; i++)
        q.add(q.remove());
}
