/* In this problem, the scenario we are evaluating is the following: You're 
 * standing at the base of a staircase and are heading to the top. A small 
 * stride will move up one stair, and a large stride advances two. You want to 
 * count the number of ways to climb the entire staircase based on different 
 * combinations of large and small strides. For example, a staircase of three 
 * steps can be climbed in three different ways: three small strides, one 
 * small stride followed by one large stride, or one large followed by one 
 * small. Write a recursive method waysToClimb that takes a non-negative 
 * integer value representing a number of stairs and prints each unique way to 
 * climb a staircase of that height, taking strides of one or two stairs at a 
 * time. Your method should output each way to climb the stairs on its own 
 * line, using a 1 to indicate a small stride of 1 stair, and a 2 to indicate 
 * a large stride of 2 stairs.
 */
public void waysToClimb(int n) {
    Stack<Integer> steps = new Stack<Integer>();
    waysToClimb(n, steps);
}

public void waysToClimb(int n, Stack<Integer> steps) {
    if(n <= 0)
        return;
        
    if(n == 1) {
        steps.push(1);
        System.out.println(steps);
        steps.pop();
        return;
    }
    
    if(n == 2) {
        steps.push(2);
        System.out.println(steps);
        steps.pop();
    }
    
    steps.push(1);
    waysToClimb(n - 1, steps);
    steps.pop();
    steps.push(2);
    waysToClimb(n - 2, steps);
    steps.pop();
}
