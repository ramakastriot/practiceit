/* Write a method named hasMidpoint that accepts three integers as parameters 
 * and returns true if one of the integers is the midpoint between the other 
 * two integers; that is, if one integer is exactly halfway between them. Your 
 * method should return false if no such midpoint relationship exists. The 
 * integers could be passed in any order; the midpoint could be the 1st, 2nd, 
 * or 3rd. You must check all cases.
 */
public boolean hasMidpoint(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - max - min;
    
    return max - mid == mid - min;
}
