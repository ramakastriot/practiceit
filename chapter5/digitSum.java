/* Write a method named digitSum that accepts an integer as a parameter and 
 * returns the sum of the digits of that number. For example, digitSum(29107) 
 * returns 2+9+1+0+7 or 19. For negative numbers, return the same value that 
 * would result if the number were positive. For example, digitSum(-456) 
 * returns 4+5+6 or 15.
 */
public int digitSum(int n) {
    n = Math.abs(n);
    int sum = 0;
    
    while(n > 0) {
        sum += n % 10;
        n /= 10;
    }
    
    return sum;
}
