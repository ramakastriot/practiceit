/* Write a method largestAbsVal that accepts three integers as parameters and 
 * returns the largest of their three absolute values.
 */
public int largestAbsVal(int a, int b, int c) {
    return Math.max(Math.abs(a), Math.max(Math.abs(b), Math.abs(c)));
}
