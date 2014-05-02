/* Write a method named lastDigit that returns the last digit of an integer. 
 * It should work for negative numbers as well.
 */
public int lastDigit(int n) {
    return Math.abs(n % 10);
}
