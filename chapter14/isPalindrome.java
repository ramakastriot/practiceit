/* Write a method isPalindrome that takes a queue of integers as a parameter 
 * and returns true if the numbers in the queue represent a palindrome (and 
 * false otherwise). Your method must restore the queue so that it stores the 
 * same sequence of values after the call as it did before. You may use one 
 * stack as auxiliary storage.
 */
public boolean isPalindrome(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    boolean palindrome = true;
                
    for(int i = 0; i < size; i++) {
        int n = q.remove();
        q.add(n);
        s.push(n);
    }
                                                    
    for(int i = 0; i < size; i++) {
        int n1 = q.remove();
        int n2 = s.pop();
        
        if(n1 != n2)
            palindrome = false;
            
        q.add(n1);
    }
    
    return palindrome;
}
