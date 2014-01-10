/* Write a method expunge that accepts a stack of integers as a parameter and 
 * makes sure that the stack's elements are in non-decreasing order from top 
 * to bottom, by removing from the stack any element that is smaller than any 
 * element(s) on top of it.
 * 
 * Obey the following restrictions in your solution:
 *
 * - You may use one queue or stack (but not both) as auxiliary storage. You 
 * may not use other structures (arrays, lists, etc.), but you can have as 
 * many simple variables as you like.
 *
 * - Use stacks/queues in stack/queue-like ways only. Do not call index-based 
 * methods such as get, search, or set (or for-each) on a stack/queue. You may 
 * call only add, remove, push, pop, peek, isEmpty, and size.
 */
public void expunge(Stack<Integer> s1) {
    if(s1.size() < 2)
        return;
        
    Stack<Integer> s2 = new Stack<Integer>();
    int ontop = s1.pop();
    s2.push(ontop);
    
    while(!s1.isEmpty()) {
        int n = s1.pop();
        
        if(n >= ontop) {
            s2.push(n);
            ontop = n;
        }
    }
    
    while(!s2.isEmpty())
        s1.push(s2.pop());
}
