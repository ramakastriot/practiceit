/* Write a method named hasAnOddDigit that returns whether any digit of a 
 * positive integer is odd. Your method should return true if the number has 
 * at least one odd digit and false if none of its digits are odd.
 */
public boolean hasAnOddDigit(int num) {
    num = Math.abs(num);
    
    while(num > 0) {
        if(num % 2 == 1)
            return true;
        num /= 10;
    }
    
    return false;
}
