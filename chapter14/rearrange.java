/* Write a method rearrange that takes a queue of integers as a parameter and 
 * rearranges the order of the values so that all of the even values appear 
 * before the odd values and that otherwise preserves the original order of 
 * the list. You may use one stack as auxiliary storage.
 */
public void rearrange(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
            
    for(int k = 0; k < 2; k++) {
        for(int i = 0; i < size; i++) {
            if(q.peek() % 2 == 0)
                q.add(q.remove());
            else
                s.push(q.remove());
        }
        
        while(!s.isEmpty())
            q.add(s.pop());
    }
}
