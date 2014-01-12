/* Write a recursive method repeat that accepts a string s and an integer n as 
 * parameters and that returns a String consisting of n copies of s. Your 
 * method should throw an IllegalArgumentException if passed any negative 
 * value for n.
 */
public String repeat(String str, int n) {
    if(n < 0)
        throw new IllegalArgumentException();
        
    if(n == 0)
        return "";
        
    String half = repeat(str, n / 2);
    
    if(n % 2 == 0)
        return half + half;
        
    return str + half + half;
}
