/* Write a method reverseHalf that reverses the order of half of the elements 
 * of a Queue of integers. Your method should reverse the order of all the 
 * elements in odd-numbered positions (position 1, 3, 5, etc.) assuming that 
 * the first value in the queue has position 0. You may use a single stack as 
 * auxiliary storage.
 */
public void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
            
    for(int i = 0; i < size; i++) {
        if(i % 2 == 1)
            s.push(q.remove());
        else
            q.add(q.remove());
    }
                                                                
    while(!s.isEmpty()) {
        q.add(q.remove());
        q.add(s.pop());
    }
    
    if(size % 2 == 1)
        q.add(q.remove());
}
