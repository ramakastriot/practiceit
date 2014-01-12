/* Write a recursive method digitMatch that accepts two non-negative integers 
 * as parameters and that returns the number of digits that match between 
 * them. Two digits match if they are equal and have the same position 
 * relative to the end of the number (i.e. starting with the ones digit). Your 
 * method should throw an IllegalArgumentException if either of the two 
 * parameters is negative.
 */
public int digitMatch(int n1, int n2) {
    if(n1 < 0 || n2 < 0)
        throw new IllegalArgumentException();
        
    if(n1 < 10 || n2 < 10)
        return n1 % 10 == n2 % 10 ? 1 : 0;
        
    if(n1 % 10 == n2 % 10)
        return 1 + digitMatch(n1/10, n2/10);
        
    return digitMatch(n1/10, n2/10);
}
