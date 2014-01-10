/* Write a method equals that takes as parameters two stacks of integers and 
 * returns true if the two stacks are equal and that returns false otherwise. 
 * To be considered equal, the two stacks would have to store the same 
 * sequence of integer values in the same order. Your method is to examine the 
 * two stacks but must return them to their original state before terminating. 
 * You may use one stack as auxiliary storage.
 */
public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    int size1 = s1.size();
    int size2 = s2.size();
            
    if(size1 != size2)
        return false;
                            
    Stack<Integer> s3 = new Stack<Integer>();
    boolean areEqual = true;
                                        
    while(!s1.isEmpty()) {
        int n1 = s1.pop();
        int n2 = s2.pop();
        s3.push(n1);
        s3.push(n2);
        
        if(n1 != n2) {
            areEqual = false;
            break;
        }
    }
    
    while(!s3.isEmpty()) {
        s2.push(s3.pop());
        s1.push(s3.pop());
    }
    
    return areEqual;
}
