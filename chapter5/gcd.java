/* Write a method named gcd that accepts two integers as parameters and returns
 * the greatest common divisor of the two numbers. The greatest common divisor 
 * (GCD) of two integers a and b is the largest integer that is a factor of 
 * both a and b. The GCD of any number and 1 is 1, and the GCD of any number 
 * and 0 is that number.
 */
public int gcd(int a, int b) {
    while(b != 0) {
        int temp = a;
        a = b;
        b = temp % b;
    }
    
    return Math.abs(a);
}
