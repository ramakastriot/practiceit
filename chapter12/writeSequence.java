/* Write a method writeSequence that accepts an integer n as a parameter and 
 * prints a symmetric sequence of n numbers with descending integers ending in 
 * 1 followed by ascending integers beginning with 1. Notice that for odd 
 * numbers the sequence has a single 1 in the middle while for even values it 
 * has two 1s in the middle.
 */
public void writeSequence(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(n == 1) {
        System.out.print(1);
        return;
    }
    
    if(n == 2) {
        System.out.print("1 1");
        return;
    }
    
    int edge = (int) Math.ceil(n/2.0);
    
    System.out.print(edge + " ");
    writeSequence(n-2);
    System.out.print(" " + edge);
}
