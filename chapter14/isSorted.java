/* Write a method isSorted that accepts a stack of integers as a parameter and 
 * returns true if the elements in the stack occur in ascending 
 * (non-decreasing) order from top to bottom, and false otherwise. That is, 
 * the smallest element should be on top, growing larger toward the bottom. An 
 * empty or one-element stack is considered to be sorted. When your method 
 * returns, the stack should be in the same state as when it was passed in. In 
 * other words, if your method modifies the stack, you must restore it before 
 * returning. You may use one queue or stack (but not both) as auxiliary 
 * storage. Your solution should run in O(N) time, where N is the number of 
 * elements of the stack.
 */
public boolean isSorted(Stack<Integer> s1) {
    if(s1.size() < 2)
        return true;
        
    Stack<Integer> s2 = new Stack<Integer>();
    boolean sorted = true;
    int ontop = s1.pop();
    s2.push(ontop);
    
    while(!s1.isEmpty()) {
        int n = s1.pop();
        
        if(n < ontop)
            sorted = false;
            
        ontop = n;
        s2.push(ontop);
    }
    
    while(!s2.isEmpty())
        s1.push(s2.pop());
        
    return sorted;
}
