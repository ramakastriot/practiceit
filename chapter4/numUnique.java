/* Write a method named numUnique that takes three integers as parameters and 
 * that returns the number of unique integers among the three.
 */
public int numUnique(int a, int b, int c) {
    if(a == b && b == c)
        return 1;
        
    if(a == b || a == c || b == c)
        return 2;
        
    return 3;
}
