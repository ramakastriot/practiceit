/* Write a method sumTo that accepts an integer parameter n and returns the 
 * sum of the first n reciprocals. The method should return 0.0 if passed the 
 * value 0 and should throw an IllegalArgumentException if passed a value less 
 * than 0.
 */
public double sumTo(int n) {
    if(n < 0)
        throw new IllegalArgumentException();
        
    if(n == 0)
        return 0.0;
        
    return sumTo(n-1) + 1.0 / n;
}
