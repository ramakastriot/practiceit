/* Write a method compressDuplicates that accepts a stack of integers as a 
 * parameter and that replaces each sequence of duplicates with a pair of 
 * values: a count of the number of duplicates, followed by the actual 
 * duplicated number. If the stack is empty, your method should not change it. 
 * You may use one queue as auxiliary storage to solve this problem. Your code 
 * must run in O(n) time where n is the number of elements of the original 
 * stack.
 */
public void compressDuplicates(Stack<Integer> s) {
    if(s.size() == 0)
        return;
        
    Queue<Integer> q = new LinkedList<Integer>();
    int ontop = s.pop();
    int count = 1;
    
    while(!s.isEmpty()) {
        int n = s.pop();
        
        if(n == ontop) {
            count++;
        } else {
            q.add(ontop);
            q.add(count);
            count = 1;
            ontop = n;
        }
    }
    
    q.add(ontop);
    q.add(count);
    
    while(!q.isEmpty())
        s.push(q.remove());
        
    while(!s.isEmpty())
        q.add(s.pop());
        
    while(!q.isEmpty())
        s.push(q.remove());
}
